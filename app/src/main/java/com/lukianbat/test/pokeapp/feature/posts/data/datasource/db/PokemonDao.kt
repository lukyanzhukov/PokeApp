package com.lukianbat.test.pokeapp.feature.posts.data.datasource.db

import androidx.paging.DataSource
import androidx.room.*
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto

@Dao
interface PokemonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(posts: List<PokemonDto>)

    @Query("SELECT * FROM pokemons ORDER BY indexInResponse ASC")
    fun posts(): DataSource.Factory<Int, PokemonDto>

    @Query("DELETE FROM pokemons")
    fun delete()

    @Query("SELECT MAX(indexInResponse) + 1 FROM pokemons")
    fun getNextIndex(): Int
}