package com.lukianbat.test.pokeapp.feature.posts.data.repository

import android.util.Log
import androidx.annotation.MainThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.paging.LivePagedListBuilder
import com.lukianbat.test.pokeapp.core.extensions.info
import com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing
import com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState
import com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.SubredditBoundaryCallback
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApiDataSource
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonCacheDataSource
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonCommonResponse
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonDetailNetworkDto
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonsListNetworkDto
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import javax.inject.Inject

interface PokemonsRepository {
    fun pokemons(): Listing<PokemonDto>
    fun randPokemons(): Listing<PokemonDto>
    fun pokemonsByAttack(): Listing<PokemonDto>
    fun pokemonsByDefence(): Listing<PokemonDto>
    fun pokemonsByHp(): Listing<PokemonDto>
}

class PokemonsRepositoryImpl @Inject constructor(
    private val apiDataSource: PokemonListApiDataSource,
    private val cacheDataSource: PokemonCacheDataSource,
    private val pokemonsConverter: PokemonsConverter

) : PokemonsRepository {

    val ioExecutor: ExecutorService = Executors.newSingleThreadExecutor()


    private fun insertResultIntoDb(res: PokemonsListNetworkDto) {
        val start = cacheDataSource.getIndex()
        val commonResponseList = res.results.map {
            val detail =
                apiDataSource.getPokemonDetail(it.name).execute().body() as PokemonDetailNetworkDto
            PokemonCommonResponse(
                it,
                detail
            )
        }
        cacheDataSource.insert(
            pokemonsConverter.convert(commonResponseList, start)
        )
    }

    @MainThread
    private fun refresh(): LiveData<NetworkState> {
        val networkState = MutableLiveData<NetworkState>()
        networkState.value = NetworkState.LOADING
        apiDataSource.getPokemonsTop(BEGIN).enqueue(
            object : Callback<PokemonsListNetworkDto> {
                override fun onFailure(call: Call<PokemonsListNetworkDto>, t: Throwable) {
                    networkState.value = NetworkState.error(t.message)
                }

                override fun onResponse(
                    call: Call<PokemonsListNetworkDto>,
                    response: Response<PokemonsListNetworkDto>
                ) {
                    ioExecutor.execute {
                        cacheDataSource.delete()
                        response.body()?.let { insertResultIntoDb(it) }
                        networkState.postValue(NetworkState.LOADED)
                    }
                }
            }
        )
        return networkState
    }

    override fun pokemonsByAttack(): Listing<PokemonDto> =
        pokemons(LivePagedListBuilder(cacheDataSource.pokemonsByAttack(), LIMIT), BEGIN)


    override fun pokemonsByDefence(): Listing<PokemonDto> =
        pokemons(LivePagedListBuilder(cacheDataSource.pokemonsByDefence(), LIMIT), BEGIN)


    override fun pokemonsByHp(): Listing<PokemonDto> =
        pokemons(LivePagedListBuilder(cacheDataSource.pokemonsByHp(), LIMIT), BEGIN)

    override fun pokemons(): Listing<PokemonDto> =
        pokemons(LivePagedListBuilder(cacheDataSource.pokemons(), LIMIT), BEGIN)

    override fun randPokemons(): Listing<PokemonDto> {
        ioExecutor.execute {
            cacheDataSource.delete()
        }
        val rand = (0..MAX_BEGIN).random()
        info(rand.toString())
        return pokemons(
            LivePagedListBuilder(cacheDataSource.pokemons(), LIMIT),
            rand
        )
    }

    private fun pokemons(
        livePagedListBuilder: LivePagedListBuilder<Int, PokemonDto>,
        startIndex: Int
    ): Listing<PokemonDto> {

        val boundaryCallback =
            SubredditBoundaryCallback(
                webservice = apiDataSource,
                limit = LIMIT,
                handleResponse = this::insertResultIntoDb,
                ioExecutor = ioExecutor,
                startIndex = startIndex
            )
        val refreshTrigger = MutableLiveData<Unit>()
        val refreshState = Transformations.switchMap(refreshTrigger) {
            refresh()
        }
        val livePagedList = livePagedListBuilder
            .setBoundaryCallback(boundaryCallback)
            .build()

        return Listing(
            pagedList = livePagedList,
            networkState = boundaryCallback.networkState,
            retry = {
                boundaryCallback.helper.retryAllFailed()
            },
            refresh = {
                refreshTrigger.value = null
            },
            refreshState = refreshState
        )
    }

    companion object {
        const val LIMIT = 30
        const val MAX_BEGIN = 777
        const val BEGIN = 0
    }
}