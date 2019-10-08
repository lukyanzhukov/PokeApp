package com.lukianbat.test.pokeapp.feature.posts.presentation

import androidx.lifecycle.ViewModel
import com.lukianbat.test.pokeapp.core.presentation.eventsdispatcher.EventsDispatcher
import com.lukianbat.test.pokeapp.core.presentation.eventsdispatcher.EventsDispatcherOwner
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto
import com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonListUseCase
import com.lukianbat.test.pokeapp.feature.posts.presentation.recycler.OnItemClickListener
import javax.inject.Inject

class PokemonListViewModel @Inject constructor(getPokemonListUseCase: GetPokemonListUseCase) :
    ViewModel(), EventsDispatcherOwner<PokemonListViewModel.EventsListener>, OnItemClickListener {

    override fun onItemClick(pokemonDto: PokemonDto) {
        eventsDispatcher.dispatchEvent { openPokemon(pokemonDto) }
    }

    override val eventsDispatcher: EventsDispatcher<EventsListener> = EventsDispatcher()

    private val repoResult = getPokemonListUseCase.getPosts()
    val posts = repoResult.pagedList
    val networkState = repoResult.networkState
    val refreshState = repoResult.refreshState

    fun refresh() {
        repoResult.refresh.invoke()
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