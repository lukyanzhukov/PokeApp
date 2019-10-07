package com.lukianbat.test.pokeapp.feature.posts.data.datasource.api

import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonsListNetworkDto
import retrofit2.Call
import javax.inject.Inject

interface PokemonListApiDataSource {
    fun getPokemonsTop(): Call<PokemonsListNetworkDto>
    fun getPokemonsTopAfter(after: Int): Call<PokemonsListNetworkDto>
}

class PokemonListApiDataSourceImpl @Inject constructor(
    private val api: PokemonListApi
) :
    PokemonListApiDataSource {

    override fun getPokemonsTop(): Call<PokemonsListNetworkDto> = api.getPokemons(0, LIMIT)


    override fun getPokemonsTopAfter(after: Int): Call<PokemonsListNetworkDto> =
        api.getPokemons(after, LIMIT)

    companion object {
        const val LIMIT = 20
    }
}