package com.lukianbat.test.pokeapp.feature.posts.presentation.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/presentation/dagger/PostsActivityModule;", "", "()V", "providePresenter", "Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListViewModel;", "context", "Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListActivity;", "getPokemonListUseCase", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/usecase/GetPokemonListUseCase;", "app_debug"})
@dagger.Module()
public final class PostsActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel providePresenter(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListActivity context, @org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonListUseCase getPokemonListUseCase) {
        return null;
    }
    
    public PostsActivityModule() {
        super();
    }
}