package com.lukianbat.test.pokeapp.feature.posts.data.repository.dagger

import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApiDataSource
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.dagger.ApiDataSourceModule
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.dagger.CacheDataSourceModule
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonCacheDataSource
import com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsConverter
import com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsConverterImpl
import com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsRepository
import com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsRepositoryImpl
import dagger.Module
import dagger.Provides

@Module(includes = [ApiDataSourceModule::class, CacheDataSourceModule::class])
class PokemonsRepositoryModule {


    @Provides
    fun providePokemonConverter(): PokemonsConverter =
        PokemonsConverterImpl()

    @Provides
    fun providePokemonsRepository(
        apiDataSource: PokemonListApiDataSource,
        cacheDataSource: PokemonCacheDataSource,
        pokemonsConverter: PokemonsConverter
    ): PokemonsRepository =
        PokemonsRepositoryImpl(apiDataSource, cacheDataSource, pokemonsConverter)

}