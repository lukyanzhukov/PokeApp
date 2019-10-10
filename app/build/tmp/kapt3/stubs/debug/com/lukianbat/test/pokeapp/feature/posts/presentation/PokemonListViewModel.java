package com.lukianbat.test.pokeapp.feature.posts.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\'B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0016J\u0006\u0010 \u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u001eJ\u0006\u0010\"\u001a\u00020\u001eJ\u0006\u0010#\u001a\u00020\u001eJ\u0006\u0010$\u001a\u00020\u001eJ\u0006\u0010%\u001a\u00020\u001eJ\u0006\u0010&\u001a\u00020\u001eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/lukianbat/test/pokeapp/core/presentation/eventsdispatcher/EventsDispatcherOwner;", "Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListViewModel$EventsListener;", "Lcom/lukianbat/test/pokeapp/feature/posts/presentation/recycler/OnItemClickListener;", "getPokemonsUseCase", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/usecase/GetPokemonsUseCase;", "(Lcom/lukianbat/test/pokeapp/feature/posts/domain/usecase/GetPokemonsUseCase;)V", "eventsDispatcher", "Lcom/lukianbat/test/pokeapp/core/presentation/eventsdispatcher/EventsDispatcher;", "getEventsDispatcher", "()Lcom/lukianbat/test/pokeapp/core/presentation/eventsdispatcher/EventsDispatcher;", "networkState", "Landroidx/lifecycle/LiveData;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/NetworkState;", "getNetworkState", "()Landroidx/lifecycle/LiveData;", "setNetworkState", "(Landroidx/lifecycle/LiveData;)V", "posts", "Landroidx/paging/PagedList;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDto;", "getPosts", "setPosts", "refreshState", "getRefreshState", "setRefreshState", "repoResult", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/Listing;", "onItemClick", "", "pokemonDto", "pokemons", "randsPokemons", "refresh", "retry", "sortByAttack", "sortByDefence", "sortByHp", "EventsListener", "app_debug"})
public final class PokemonListViewModel extends androidx.lifecycle.ViewModel implements com.lukianbat.test.pokeapp.core.presentation.eventsdispatcher.EventsDispatcherOwner<com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel.EventsListener>, com.lukianbat.test.pokeapp.feature.posts.presentation.recycler.OnItemClickListener {
    private com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> repoResult;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<androidx.paging.PagedList<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto>> posts;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState> networkState;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState> refreshState;
    @org.jetbrains.annotations.NotNull()
    private final com.lukianbat.test.pokeapp.core.presentation.eventsdispatcher.EventsDispatcher<com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel.EventsListener> eventsDispatcher = null;
    private final com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonsUseCase getPokemonsUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto>> getPosts() {
        return null;
    }
    
    public final void setPosts(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<androidx.paging.PagedList<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState> getNetworkState() {
        return null;
    }
    
    public final void setNetworkState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState> getRefreshState() {
        return null;
    }
    
    public final void setRefreshState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lukianbat.test.pokeapp.core.presentation.eventsdispatcher.EventsDispatcher<com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel.EventsListener> getEventsDispatcher() {
        return null;
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto pokemonDto) {
    }
    
    public final void pokemons() {
    }
    
    public final void randsPokemons() {
    }
    
    public final void refresh() {
    }
    
    public final void sortByAttack() {
    }
    
    public final void sortByDefence() {
    }
    
    public final void sortByHp() {
    }
    
    public final void retry() {
    }
    
    @javax.inject.Inject()
    public PokemonListViewModel(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonsUseCase getPokemonsUseCase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListViewModel$EventsListener;", "", "openPokemon", "", "pokemonDto", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDto;", "showMessage", "message", "", "app_debug"})
    public static abstract interface EventsListener {
        
        public abstract void openPokemon(@org.jetbrains.annotations.NotNull()
        com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto pokemonDto);
        
        public abstract void showMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
    }
}