package com.lukianbat.test.pokeapp.feature.posts.data.repository.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/repository/dagger/PokemonsRepositoryModule;", "", "()V", "providePokemonConverter", "Lcom/lukianbat/test/pokeapp/feature/posts/data/repository/PokemonsConverter;", "providePokemonsRepository", "Lcom/lukianbat/test/pokeapp/feature/posts/data/repository/PokemonsRepository;", "apiDataSource", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApiDataSource;", "cacheDataSource", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/db/PokemonCacheDataSource;", "pokemonsConverter", "app_debug"})
@dagger.Module(includes = {com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.dagger.ApiDataSourceModule.class, com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.dagger.CacheDataSourceModule.class})
public final class PokemonsRepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsConverter providePokemonConverter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsRepository providePokemonsRepository(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApiDataSource apiDataSource, @org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonCacheDataSource cacheDataSource, @org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsConverter pokemonsConverter) {
        return null;
    }
    
    public PokemonsRepositoryModule() {
        super();
    }
}