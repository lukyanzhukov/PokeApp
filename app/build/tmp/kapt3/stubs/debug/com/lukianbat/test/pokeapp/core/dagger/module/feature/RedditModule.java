package com.lukianbat.test.pokeapp.core.dagger.module.feature;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'\u00a8\u0006\u0004"}, d2 = {"Lcom/lukianbat/test/pokeapp/core/dagger/module/feature/RedditModule;", "", "redditActivityInjector", "Lcom/lukianbat/test/pokeapp/feature/posts/presentation/PokemonListActivity;", "app_debug"})
@dagger.Module(includes = {com.lukianbat.test.pokeapp.feature.posts.domain.dagger.GetPostsUseCaseModule.class})
public abstract interface RedditModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.lukianbat.test.pokeapp.feature.posts.presentation.dagger.PostsActivityModule.class})
    @com.lukianbat.test.pokeapp.core.dagger.scope.ActivityScope()
    public abstract com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListActivity redditActivityInjector();
}