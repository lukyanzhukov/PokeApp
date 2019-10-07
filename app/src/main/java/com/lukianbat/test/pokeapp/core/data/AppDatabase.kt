package com.lukianbat.test.pokeapp.core.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonDao
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto

@Database(
    entities = [PokemonDto::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun redditEntryDao(): PokemonDao
}