package com.lukianbat.test.pokeapp.feature.posts.domain.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.DBConverter
import kotlinx.android.parcel.Parcelize

@Parcelize
@TypeConverters(DBConverter::class)
@Entity(tableName = "pokemons")
data class PokemonDto(
    @PrimaryKey
    val name: String,
    val url: String,
    val attack: Int,
    val defence: Int,
    val hp: Int,
    val types: List<String>,
    val abilities: List<String>,
    val height: Int,
    val weight: Int
) : Parcelable