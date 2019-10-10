package com.lukianbat.test.pokeapp.feature.posts.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.lukianbat.test.pokeapp.core.presentation.eventsdispatcher.EventsDispatcher
import com.lukianbat.test.pokeapp.core.presentation.eventsdispatcher.EventsDispatcherOwner
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto
import com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing
import com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState
import com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonsUseCase
import com.lukianbat.test.pokeapp.feature.posts.presentation.recycler.OnItemClickListener
import javax.inject.Inject

class PokemonListViewModel @Inject constructor(private val getPokemonsUseCase: GetPokemonsUseCase) :
    ViewModel(), EventsDispatcherOwner<PokemonListViewModel.EventsListener>, OnItemClickListener {

    private lateinit var repoResult: Listing<PokemonDto>
    lateinit var posts: LiveData<PagedList<PokemonDto>>
    lateinit var networkState: LiveData<NetworkState>
    lateinit var refreshState: LiveData<NetworkState>
    override val eventsDispatcher: EventsDispatcher<EventsListener> = EventsDispatcher()

    init {
        pokemons()
    }

    override fun onItemClick(pokemonDto: PokemonDto) {
        eventsDispatcher.dispatchEvent { openPokemon(pokemonDto) }
    }

    fun pokemons() {
        repoResult = getPokemonsUseCase.getPokemons()
        posts = repoResult.pagedList
        networkState = repoResult.networkState
        refreshState = repoResult.refreshState
    }


    fun randsPokemons() {
        repoResult = getPokemonsUseCase.getRandPokemons()
        posts = repoResult.pagedList
        networkState = repoResult.networkState
        refreshState = repoResult.refreshState
    }

    fun refresh() {
        repoResult.refresh.invoke()
    }

    fun sortByAttack() {
        repoResult = getPokemonsUseCase.getPokemonsByAttack()
        posts = repoResult.pagedList
        networkState = repoResult.networkState
        refreshState = repoResult.refreshState
    }

    fun sortByDefence() {
        repoResult = getPokemonsUseCase.getPokemonsByDefence()
        posts = repoResult.pagedList
        networkState = repoResult.networkState
        refreshState = repoResult.refreshState
    }

    fun sortByHp() {
        repoResult = getPokemonsUseCase.getPokemonsByHp()
        posts = repoResult.pagedList
        networkState = repoResult.networkState
        refreshState = repoResult.refreshState
    }

    fun retry() {
        val listing = repoResult
        listing.retry.invoke()
    }

    interface EventsListener {
        fun openPokemon(pokemonDto: PokemonDto)
        fun showMessage(message: String)
    }
}