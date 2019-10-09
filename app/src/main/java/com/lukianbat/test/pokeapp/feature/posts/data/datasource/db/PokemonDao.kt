package com.lukianbat.test.pokeapp.feature.posts.data.datasource.db

import androidx.paging.DataSource
import androidx.room.*
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto

@Dao
interface PokemonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(posts: List<PokemonDto>)

    @Query("SELECT MAX(indexInResponse) + 1 FROM pokemons")
    fun getNextIndex(): Int

    @Query("SELECT * FROM pokemons ORDER BY attack ASC")
    fun pokemonsByAttack(): DataSource.Factory<Int, PokemonDto>

    @Query("SELECT * FROM pokemons ORDER BY defence ASC")
    fun pokemonsByDefence(): DataSource.Factory<Int, PokemonDto>

    @Query("SELECT * FROM pokemons ORDER BY hp ASC")
    fun pokemonsByHp(): DataSource.Factory<Int, PokemonDto>

    @Query("SELECT * FROM pokemons ORDER BY indexInResponse ASC")
    fun pokemons(): DataSource.Factory<Int, PokemonDto>

    @Query("DELETE FROM pokemons")
    fun delete()

}