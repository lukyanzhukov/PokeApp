package com.lukianbat.test.pokeapp.feature.posts.data.datasource.api

import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonDetailNetworkDto
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonsListNetworkDto
import retrofit2.Call
import javax.inject.Inject

interface PokemonListApiDataSource {
    fun getPokemonsTop(index: Int): Call<PokemonsListNetworkDto>
    fun getPokemonsTopAfter(after: Int): Call<PokemonsListNetworkDto>
    fun getPokemonDetail(pokemonName: String): Call<PokemonDetailNetworkDto>
}

class PokemonListApiDataSourceImpl @Inject constructor(
    private val api: PokemonListApi
) :
    PokemonListApiDataSource {
    override fun getPokemonDetail(pokemonName: String): Call<PokemonDetailNetworkDto> =
        api.getPokemon(pokemonName)


    override fun getPokemonsTop(index: Int): Call<PokemonsListNetworkDto> =
        api.getPokemons(index, LIMIT)

    override fun getPokemonsTopAfter(after: Int): Call<PokemonsListNetworkDto> =
        api.getPokemons(after, LIMIT)

    companion object {
        const val LIMIT = 30
    }
}