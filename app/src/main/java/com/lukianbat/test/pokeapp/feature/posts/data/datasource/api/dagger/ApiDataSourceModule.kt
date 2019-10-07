package com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.dagger

import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApi
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApiDataSource
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApiDataSourceImpl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class ApiDataSourceModule {

    @Provides
    fun providePokemonApi(retrofit: Retrofit): PokemonListApi =
        retrofit.create(PokemonListApi::class.java)


    @Provides
    fun providesDataSource(
        api: PokemonListApi
    ): PokemonListApiDataSource = PokemonListApiDataSourceImpl(api)


}