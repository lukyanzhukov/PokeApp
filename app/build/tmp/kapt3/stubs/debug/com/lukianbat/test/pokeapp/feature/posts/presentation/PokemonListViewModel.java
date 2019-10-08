package com.lukianbat.test.pokeapp.feature.posts.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u001eB\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u0006\u0010\u001c\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u001aR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/lukianbat/test/pokeapp/core/presentation/eventsdispatcher/EventsDispatcherOwner;", "Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListViewModel$EventsListener;", "Lcom/lukianbat/test/pokeapp/feature/posts/presentation/recycler/OnItemClickListener;", "getPokemonListUseCase", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/usecase/GetPokemonListUseCase;", "(Lcom/lukianbat/test/pokeapp/feature/posts/domain/usecase/GetPokemonListUseCase;)V", "eventsDispatcher", "Lcom/lukianbat/test/pokeapp/core/presentation/eventsdispatcher/EventsDispatcher;", "getEventsDispatcher", "()Lcom/lukianbat/test/pokeapp/core/presentation/eventsdispatcher/EventsDispatcher;", "networkState", "Landroidx/lifecycle/LiveData;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/NetworkState;", "getNetworkState", "()Landroidx/lifecycle/LiveData;", "posts", "Landroidx/paging/PagedList;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDto;", "getPosts", "refreshState", "getRefreshState", "repoResult", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/Listing;", "onItemClick", "", "pokemonDto", "refresh", "retry", "EventsListener", "app_debug"})
public final class PokemonListViewModel extends androidx.lifecycle.ViewModel implements com.lukianbat.test.pokeapp.core.presentation.eventsdispatcher.EventsDispatcherOwner<com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel.EventsListener>, com.lukianbat.test.pokeapp.feature.posts.presentation.recycler.OnItemClickListener {
    @org.jetbrains.annotations.NotNull()
    private final com.lukianbat.test.pokeapp.core.presentation.eventsdispatcher.EventsDispatcher<com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel.EventsListener> eventsDispatcher = null;
    private final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> repoResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto>> posts = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState> networkState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState> refreshState = null;
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto pokemonDto) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lukianbat.test.pokeapp.core.presentation.eventsdispatcher.EventsDispatcher<com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel.EventsListener> getEventsDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto>> getPosts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState> getNetworkState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState> getRefreshState() {
        return null;
    }
    
    public final void refresh() {
    }
    
    public final void retry() {
    }
    
    @javax.inject.Inject()
    public PokemonListViewModel(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonListUseCase getPokemonListUseCase) {
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