package com.lukianbat.test.pokeapp.feature.posts.data.datasource.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u000f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApiDataSourceImpl;", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApiDataSource;", "api", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApi;", "(Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApi;)V", "getPokemonDetail", "Lretrofit2/Call;", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/model/PokemonDetailNetworkDto;", "pokemonName", "", "getPokemonsTop", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/model/PokemonsListNetworkDto;", "index", "", "getPokemonsTopAfter", "after", "Companion", "app_debug"})
public final class PokemonListApiDataSourceImpl implements com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApiDataSource {
    private final com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApi api = null;
    public static final int LIMIT = 30;
    public static final com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApiDataSourceImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.Call<com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonDetailNetworkDto> getPokemonDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String pokemonName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.Call<com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonsListNetworkDto> getPokemonsTop(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.Call<com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonsListNetworkDto> getPokemonsTopAfter(int after) {
        return null;
    }
    
    @javax.inject.Inject()
    public PokemonListApiDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApi api) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApiDataSourceImpl$Companion;", "", "()V", "LIMIT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}