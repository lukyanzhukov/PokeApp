package com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/dagger/ApiDataSourceModule;", "", "()V", "providePokemonApi", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApi;", "retrofit", "Lretrofit2/Retrofit;", "providesDataSource", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApiDataSource;", "api", "app_debug"})
@dagger.Module()
public final class ApiDataSourceModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApi providePokemonApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApiDataSource providesDataSource(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApi api) {
        return null;
    }
    
    public ApiDataSourceModule() {
        super();
    }
}