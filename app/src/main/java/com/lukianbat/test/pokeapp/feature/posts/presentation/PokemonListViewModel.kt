package com.lukianbat.test.pokeapp.feature.posts.presentation

import androidx.lifecycle.ViewModel
import com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonListUseCase
import javax.inject.Inject

class PokemonListViewModel @Inject constructor(getPokemonListUseCase: GetPokemonListUseCase) : ViewModel() {

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
}