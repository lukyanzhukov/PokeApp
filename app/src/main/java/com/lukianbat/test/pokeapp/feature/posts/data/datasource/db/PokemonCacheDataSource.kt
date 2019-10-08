package com.lukianbat.test.pokeapp.feature.posts.data.datasource.db

import androidx.paging.DataSource
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto
import javax.inject.Inject

interface PokemonCacheDataSource {

    fun insert(posts: List<PokemonDto>)
    fun pokemons(): DataSource.Factory<Int, PokemonDto>
    fun delete()
}

class PokemonCacheDataSourceImpl @Inject constructor(private val dao: PokemonDao) :
    PokemonCacheDataSource {

    override fun pokemons(): DataSource.Factory<Int, PokemonDto> =
        dao.posts()

    override fun delete() = dao.delete()


    override fun insert(posts: List<PokemonDto>) = dao.insert(posts)


}