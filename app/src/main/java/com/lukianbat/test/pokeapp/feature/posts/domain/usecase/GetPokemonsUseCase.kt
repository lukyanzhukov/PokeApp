package com.lukianbat.test.pokeapp.feature.posts.domain.usecase

import com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto

interface GetPokemonsUseCase {
    fun getPokemons(): Listing<PokemonDto>
    fun getPokemonsByAttack(): Listing<PokemonDto>
    fun getPokemonsByDefence(): Listing<PokemonDto>
    fun getPokemonsByHp(): Listing<PokemonDto>

}