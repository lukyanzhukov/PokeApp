package com.lukianbat.test.pokeapp.feature.posts.presentation.dagger

import androidx.lifecycle.ViewModelProvider
import com.lukianbat.test.pokeapp.core.presentation.viewmodel.ViewModelFactory
import com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonsUseCase
import com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListActivity
import com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListViewModel
import dagger.Module
import dagger.Provides

@Module
class PostsActivityModule {

    @Provides
    fun providePresenter(
        context: PokemonListActivity,
        getPokemonsUseCase: GetPokemonsUseCase
    ): PokemonListViewModel = ViewModelFactory {
        PokemonListViewModel(getPokemonsUseCase)
    }.let { viewModelFactory ->
        ViewModelProvider(context, viewModelFactory)[PokemonListViewModel::class.java]
    }

}
