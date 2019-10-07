package com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary

import androidx.annotation.MainThread
import androidx.paging.PagedList
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApiDataSource
import com.lukianbat.test.pokeapp.feature.posts.domain.model.*
import com.lukianbat.test.pokeapp.feature.posts.domain.recycler.helper.PagingRequestHelper
import com.lukianbat.test.pokeapp.feature.posts.domain.recycler.helper.createStatusLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.Executor

class SubredditBoundaryCallback(
    private val webservice: PokemonListApiDataSource,
    private val handleResponse: (PokemonsListNetworkDto) -> Unit,
    private val ioExecutor: Executor
) : PagedList.BoundaryCallback<PokemonDto>() {

    val helper =
        PagingRequestHelper(
            ioExecutor
        )
    val networkState = helper.createStatusLiveData()

    @MainThread
    override fun onZeroItemsLoaded() {
        helper.runIfNotRunning(PagingRequestHelper.RequestType.INITIAL) {
            webservice.getPokemonsTop()
                .enqueue(createWebserviceCallback(it))
        }
    }

    @MainThread
    override fun onItemAtEndLoaded(itemAtEnd: PokemonDto) {
        helper.runIfNotRunning(PagingRequestHelper.RequestType.AFTER) {
            webservice.getPokemonsTopAfter(after = itemAtEnd.indexInResponse)
                .enqueue(createWebserviceCallback(it))
        }
    }

    private fun insertItemsIntoDb(
        response: Response<PokemonsListNetworkDto>,
        it: PagingRequestHelper.Request.Callback
    ) {
        ioExecutor.execute {
            response.body()?.let { it1 -> handleResponse(it1) }
            it.recordSuccess()
        }
    }

    override fun onItemAtFrontLoaded(itemAtFront: PokemonDto) {
    }


    private fun createWebserviceCallback(it: PagingRequestHelper.Request.Callback)
            : Callback<PokemonsListNetworkDto> {
        return object : Callback<PokemonsListNetworkDto> {
            override fun onFailure(call: Call<PokemonsListNetworkDto>, t: Throwable) {
                it.recordFailure(t)
            }

            override fun onResponse(
                call: Call<PokemonsListNetworkDto>,
                response: Response<PokemonsListNetworkDto>
            ) {
                insertItemsIntoDb(response, it)
            }
        }
    }
}