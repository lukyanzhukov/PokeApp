package com.lukianbat.test.pokeapp.feature.posts.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/repository/PokemonsRepositoryImpl;", "Lcom/lukianbat/test/pokeapp/feature/posts/data/repository/PokemonsRepository;", "apiDataSource", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApiDataSource;", "cacheDataSource", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/db/PokemonCacheDataSource;", "pokemonsConverter", "Lcom/lukianbat/test/pokeapp/feature/posts/data/repository/PokemonsConverter;", "(Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApiDataSource;Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/db/PokemonCacheDataSource;Lcom/lukianbat/test/pokeapp/feature/posts/data/repository/PokemonsConverter;)V", "ioExecutor", "Ljava/util/concurrent/ExecutorService;", "getIoExecutor", "()Ljava/util/concurrent/ExecutorService;", "insertResultIntoDb", "", "res", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/model/PokemonsListNetworkDto;", "pokemons", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/Listing;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDto;", "livePagedListBuilder", "Landroidx/paging/LivePagedListBuilder;", "", "startIndex", "pokemonsByAttack", "pokemonsByDefence", "pokemonsByHp", "randPokemons", "refresh", "Landroidx/lifecycle/LiveData;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/NetworkState;", "Companion", "app_debug"})
public final class PokemonsRepositoryImpl implements com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsRepository {
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ExecutorService ioExecutor = null;
    private final com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApiDataSource apiDataSource = null;
    private final com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonCacheDataSource cacheDataSource = null;
    private final com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsConverter pokemonsConverter = null;
    public static final int LIMIT = 30;
    public static final int MAX_BEGIN = 777;
    public static final int BEGIN = 0;
    public static final com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsRepositoryImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ExecutorService getIoExecutor() {
        return null;
    }
    
    private final void insertResultIntoDb(com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonsListNetworkDto res) {
    }
    
    @androidx.annotation.MainThread()
    private final androidx.lifecycle.LiveData<com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState> refresh() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> pokemonsByAttack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> pokemonsByDefence() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> pokemonsByHp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> pokemons() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> randPokemons() {
        return null;
    }
    
    private final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> pokemons(androidx.paging.LivePagedListBuilder<java.lang.Integer, com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> livePagedListBuilder, int startIndex) {
        return null;
    }
    
    @javax.inject.Inject()
    public PokemonsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApiDataSource apiDataSource, @org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonCacheDataSource cacheDataSource, @org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsConverter pokemonsConverter) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/repository/PokemonsRepositoryImpl$Companion;", "", "()V", "BEGIN", "", "LIMIT", "MAX_BEGIN", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}