package com.lukianbat.test.pokeapp.feature.posts.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0004X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u0014@VX\u0095.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\fX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006*"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListActivity;", "Lcom/lukianbat/test/pokeapp/core/presentation/activity/EventsActivity;", "Lcom/lukianbat/test/pokeapp/databinding/ActivityPokemonListBinding;", "Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListViewModel;", "Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListViewModel$EventsListener;", "()V", "adapter", "Lcom/lukianbat/test/pokeapp/feature/posts/presentation/recycler/PostsAdapter;", "eventsListener", "getEventsListener", "()Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListViewModel$EventsListener;", "layoutId", "", "getLayoutId", "()I", "<set-?>", "viewModel", "getViewModel", "()Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListViewModel;", "setViewModel", "(Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListViewModel;)V", "viewModelVariableId", "getViewModelVariableId", "initAdapter", "", "initSwipeToRefresh", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "openPokemon", "pokemonDto", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDto;", "showMessage", "message", "", "app_debug"})
public final class PokemonListActivity extends com.lukianbat.test.pokeapp.core.presentation.activity.EventsActivity<com.lukianbat.test.pokeapp.databinding.ActivityPokemonListBinding, com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel, com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel.EventsListener> implements com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel.EventsListener {
    private com.lukianbat.test.pokeapp.feature.posts.presentation.recycler.PostsAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel.EventsListener eventsListener = null;
    private final int viewModelVariableId = 0;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel viewModel;
    private final int layoutId = com.lukianbat.test.pokeapp.R.layout.activity_pokemon_list;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void openPokemon(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto pokemonDto) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel.EventsListener getEventsListener() {
        return null;
    }
    
    @java.lang.Override()
    protected int getViewModelVariableId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel getViewModel() {
        return null;
    }
    
    public void setViewModel(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel p0) {
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    private final void initAdapter() {
    }
    
    private final void initSwipeToRefresh() {
    }
    
    public PokemonListActivity() {
        super();
    }
}