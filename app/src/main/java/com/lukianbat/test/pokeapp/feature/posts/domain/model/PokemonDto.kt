package com.lukianbat.test.pokeapp.feature.posts.domain.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "pokemons")
data class PokemonDto(
    @PrimaryKey
    val name: String,
    val url: String,
    val attack: Int,
    val defence: Int,
    val hp: Int,
    val types: String,
    val abilities: String,
    val height: Int,
    val weight: Int
) : Parcelable {
    var indexInResponse: Int = -1
}