package com.lukianbat.test.pokeapp.feature.posts.data.datasource.api

import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonDetailNetworkDto
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonsListNetworkDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonListApi {

    @GET("pokemon")
    fun getPokemons(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Call<PokemonsListNetworkDto>

    @GET("pokemon/{pokemonName}")
    fun getPokemon(
        @Path("pokemonName") pokemonName: String
    ): Call<PokemonDetailNetworkDto>
}