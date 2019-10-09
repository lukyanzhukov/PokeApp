package com.lukianbat.test.pokeapp.feature.posts.presentation

import androidx.lifecycle.ViewModel
import com.lukianbat.test.pokeapp.core.presentation.eventsdispatcher.EventsDispatcher
import com.lukianbat.test.pokeapp.core.presentation.eventsdispatcher.EventsDispatcherOwner
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto
import com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonsUseCase
import com.lukianbat.test.pokeapp.feature.posts.presentation.recycler.OnItemClickListener
import javax.inject.Inject

class PokemonListViewModel @Inject constructor(private val getPokemonsUseCase: GetPokemonsUseCase) :
    ViewModel(), EventsDispatcherOwner<PokemonListViewModel.EventsListener>, OnItemClickListener {

    override fun onItemClick(pokemonDto: PokemonDto) {
        eventsDispatcher.dispatchEvent { openPokemon(pokemonDto) }
    }

    override val eventsDispatcher: EventsDispatcher<EventsListener> = EventsDispatcher()

    private var repoResult = getPokemonsUseCase.getPokemons()
    var posts = repoResult.pagedList
    var networkState = repoResult.networkState
    var refreshState = repoResult.refreshState

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