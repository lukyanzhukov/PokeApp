package com.lukianbat.test.pokeapp.feature.posts.data.datasource.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/db/PokemonCacheDataSource;", "", "delete", "", "getNextIndex", "", "insert", "posts", "", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDto;", "pokemons", "Landroidx/paging/DataSource$Factory;", "app_debug"})
public abstract interface PokemonCacheDataSource {
    
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> posts);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> pokemons();
    
    public abstract void delete();
    
    public abstract int getNextIndex();
}