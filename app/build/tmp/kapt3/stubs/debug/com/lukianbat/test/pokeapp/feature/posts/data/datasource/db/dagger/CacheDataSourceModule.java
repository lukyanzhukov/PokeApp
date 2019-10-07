package com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/db/dagger/CacheDataSourceModule;", "", "()V", "provideDao", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/db/PokemonDao;", "database", "Lcom/lukianbat/test/pokeapp/core/data/AppDatabase;", "providesDataSource", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/db/PokemonCacheDataSource;", "dao", "app_debug"})
@dagger.Module()
public final class CacheDataSourceModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonDao provideDao(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.core.data.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonCacheDataSource providesDataSource(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonDao dao) {
        return null;
    }
    
    public CacheDataSourceModule() {
        super();
    }
}