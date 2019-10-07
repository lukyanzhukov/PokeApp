package com.lukianbat.test.pokeapp.feature.posts.domain.usecase

import com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing
import com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsRepository
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto
import javax.inject.Inject

interface GetPokemonListUseCase {
    fun getPosts(): Listing<PokemonDto>
}

class GetPokemonListUseCaseImpl @Inject constructor(private val repository: PokemonsRepository) :
    GetPokemonListUseCase {

    override fun getPosts(): Listing<PokemonDto> = repository.posts()

}