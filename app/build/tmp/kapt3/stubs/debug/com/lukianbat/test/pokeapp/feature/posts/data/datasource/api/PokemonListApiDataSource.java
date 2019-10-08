package com.lukianbat.test.pokeapp.feature.posts.data.datasource.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApiDataSource;", "", "getPokemonDetail", "Lretrofit2/Call;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDetailNetworkDto;", "pokemonName", "", "getPokemonsTop", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonsListNetworkDto;", "getPokemonsTopAfter", "after", "", "app_debug"})
public abstract interface PokemonListApiDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonsListNetworkDto> getPokemonsTop();
    
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonsListNetworkDto> getPokemonsTopAfter(int after);
    
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDetailNetworkDto> getPokemonDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String pokemonName);
}