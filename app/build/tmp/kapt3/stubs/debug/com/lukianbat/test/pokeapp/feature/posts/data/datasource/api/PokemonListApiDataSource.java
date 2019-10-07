package com.lukianbat.test.pokeapp.feature.posts.data.datasource.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApiDataSource;", "", "getPokemonsTop", "Lretrofit2/Call;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonsListNetworkDto;", "getPokemonsTopAfter", "after", "", "app_debug"})
public abstract interface PokemonListApiDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonsListNetworkDto> getPokemonsTop();
    
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonsListNetworkDto> getPokemonsTopAfter(int after);
}