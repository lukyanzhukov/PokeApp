package com.lukianbat.test.pokeapp.feature.posts.domain.usecase

import com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing
import com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsRepository
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto
import javax.inject.Inject


class GetPokemonsUseCaseImpl @Inject constructor(private val repository: PokemonsRepository) :
    GetPokemonsUseCase {
    override fun getPokemons(): Listing<PokemonDto> = repository.pokemons()

    override fun getPokemonsByDefence(): Listing<PokemonDto> = repository.pokemonsByDefence()

    override fun getPokemonsByHp(): Listing<PokemonDto> = repository.pokemonsByHp()

    override fun getPokemonsByAttack(): Listing<PokemonDto> = repository.pokemonsByDefence()


}