package com.lukianbat.test.pokeapp.core.dagger.module.feature

import com.lukianbat.test.pokeapp.core.dagger.scope.ActivityScope
import com.lukianbat.test.pokeapp.feature.posts.domain.dagger.GetPokemonsUseCaseModule
import com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListActivity
import com.lukianbat.test.pokeapp.feature.posts.presentation.dagger.PostsActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [GetPokemonsUseCaseModule::class])
interface RedditModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [PostsActivityModule::class])
    fun redditActivityInjector(): PokemonListActivity
}