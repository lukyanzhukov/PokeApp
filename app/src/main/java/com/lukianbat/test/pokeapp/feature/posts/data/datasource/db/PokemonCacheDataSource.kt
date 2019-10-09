package com.lukianbat.test.pokeapp.feature.posts.data.datasource.db

import androidx.paging.DataSource
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto
import javax.inject.Inject

interface PokemonCacheDataSource {

    fun insert(posts: List<PokemonDto>)
    fun getIndex(): Int
    fun pokemonsByAttack(): DataSource.Factory<Int, PokemonDto>
    fun pokemonsByDefence(): DataSource.Factory<Int, PokemonDto>
    fun pokemonsByHp(): DataSource.Factory<Int, PokemonDto>
    fun pokemons(): DataSource.Factory<Int, PokemonDto>
    fun delete()
}

class PokemonCacheDataSourceImpl @Inject constructor(private val dao: PokemonDao) :
    PokemonCacheDataSource {
    override fun getIndex(): Int =
        dao.getNextIndex()

    override fun pokemons(): DataSource.Factory<Int, PokemonDto> =
        dao.pokemons()

    override fun pokemonsByDefence(): DataSource.Factory<Int, PokemonDto> =
        dao.pokemonsByDefence()

    override fun pokemonsByHp(): DataSource.Factory<Int, PokemonDto> =
        dao.pokemonsByHp()

    override fun pokemonsByAttack(): DataSource.Factory<Int, PokemonDto> =
        dao.pokemonsByAttack()

    override fun delete() = dao.delete()


    override fun insert(posts: List<PokemonDto>) = dao.insert(posts)


}