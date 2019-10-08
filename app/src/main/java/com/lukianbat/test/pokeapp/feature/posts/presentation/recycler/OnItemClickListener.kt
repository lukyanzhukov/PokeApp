package com.lukianbat.test.pokeapp.feature.posts.presentation.recycler

import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto

interface OnItemClickListener {
    fun onItemClick(pokemonDto: PokemonDto)
}