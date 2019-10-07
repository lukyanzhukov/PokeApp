package com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.dagger

import com.lukianbat.test.pokeapp.core.data.AppDatabase
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonCacheDataSource
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonCacheDataSourceImpl
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonDao
import dagger.Module
import dagger.Provides

@Module
class CacheDataSourceModule {

    @Provides
    fun provideDao(database: AppDatabase): PokemonDao = database.redditEntryDao()

    @Provides
    fun providesDataSource(dao: PokemonDao): PokemonCacheDataSource =
        PokemonCacheDataSourceImpl(dao)
}