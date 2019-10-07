package com.lukianbat.test.pokeapp.core.dagger.module

import android.content.Context
import androidx.room.Room
import com.lukianbat.test.pokeapp.core.data.AppDatabase
import dagger.Module
import dagger.Provides

@Module
class RoomModule {

    @Provides
    fun provideAppDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()
    }

    companion object {
        const val DATABASE_NAME = "database"
    }
}