package com.lukianbat.test.pokeapp.feature.posts.data.datasource.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/db/PokemonCacheDataSourceImpl;", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/db/PokemonCacheDataSource;", "dao", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/db/PokemonDao;", "(Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/db/PokemonDao;)V", "delete", "", "getNextIndex", "", "insert", "posts", "", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDto;", "pokemons", "Landroidx/paging/DataSource$Factory;", "app_debug"})
public final class PokemonCacheDataSourceImpl implements com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonCacheDataSource {
    private final com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonDao dao = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource.Factory<java.lang.Integer, com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> pokemons() {
        return null;
    }
    
    @java.lang.Override()
    public void delete() {
    }
    
    @java.lang.Override()
    public int getNextIndex() {
        return 0;
    }
    
    @java.lang.Override()
    public void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> posts) {
    }
    
    @javax.inject.Inject()
    public PokemonCacheDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonDao dao) {
        super();
    }
}