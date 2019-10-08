package com.lukianbat.test.pokeapp.feature.posts.data.datasource.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\'\u00a8\u0006\f"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApi;", "", "getPokemon", "Lretrofit2/Call;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDetailNetworkDto;", "pokemonName", "", "getPokemons", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonsListNetworkDto;", "offset", "", "limit", "app_debug"})
public abstract interface PokemonListApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "pokemon")
    public abstract retrofit2.Call<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonsListNetworkDto> getPokemons(@retrofit2.http.Query(value = "offset")
    int offset, @retrofit2.http.Query(value = "limit")
    int limit);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "pokemon/{pokemonName}")
    public abstract retrofit2.Call<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDetailNetworkDto> getPokemon(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "pokemonName")
    java.lang.String pokemonName);
}