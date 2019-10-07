package com.lukianbat.test.pokeapp.feature.posts.presentation.dagger

import androidx.lifecycle.ViewModelProvider
import com.lukianbat.test.pokeapp.core.presentation.viewmodel.ViewModelFactory
import com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonListUseCase
import com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListActivity
import com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel
import dagger.Module
import dagger.Provides

@Module
class PostsActivityModule {

    @Provides
    fun providePresenter(
        context: PokemonListActivity,
        getPokemonListUseCase: GetPokemonListUseCase
    ): PokemonListViewModel = ViewModelFactory {
        PokemonListViewModel(getPokemonListUseCase)
    }.let { viewModelFactory ->
        ViewModelProvider(context, viewModelFactory)[PokemonListViewModel::class.java]
    }

}
