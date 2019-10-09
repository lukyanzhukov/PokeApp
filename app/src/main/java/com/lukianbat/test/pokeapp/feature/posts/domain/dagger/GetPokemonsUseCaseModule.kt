package com.lukianbat.test.pokeapp.feature.posts.domain.dagger

import com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsRepository
import com.lukianbat.test.pokeapp.feature.posts.data.repository.dagger.PokemonsRepositoryModule
import com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonsUseCase
import com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonsUseCaseImpl
import dagger.Module
import dagger.Provides

@Module(includes = [PokemonsRepositoryModule::class])
class GetPokemonsUseCaseModule {

    @Provides
    fun bindsGetPostsUseCase(repository: PokemonsRepository): GetPokemonsUseCase =
        GetPokemonsUseCaseImpl(repository)
}