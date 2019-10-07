package com.lukianbat.test.pokeapp.feature.posts.data.datasource.api

import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonsListNetworkDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonListApi {

    @GET("pokemon")
    fun getPokemons(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Call<PokemonsListNetworkDto>
}