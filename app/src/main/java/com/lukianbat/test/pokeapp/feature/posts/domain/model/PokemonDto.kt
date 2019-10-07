package com.lukianbat.test.pokeapp.feature.posts.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pokemons")
data class PokemonDto(
    @PrimaryKey
    val name: String,
    val url: String
) {
    var indexInResponse: Int = -1
}