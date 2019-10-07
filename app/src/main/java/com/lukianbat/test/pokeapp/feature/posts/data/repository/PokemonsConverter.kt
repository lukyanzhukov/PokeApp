package com.lukianbat.test.pokeapp.feature.posts.data.repository

import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonsListNetworkDto
import javax.inject.Inject

interface PokemonsConverter {

    fun convert(response: PokemonsListNetworkDto, start: Int): List<PokemonDto>
}

private const val IMAGE_URL =
    "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"
private const val URL_DIVIDER = '/'
private const val IMAGE_SUFFIX = ".png"

class PokemonsConverterImpl @Inject constructor() :
    PokemonsConverter {

    override fun convert(response: PokemonsListNetworkDto, start: Int): List<PokemonDto> =
        response.results.mapIndexed { index, dto ->
            val pokemonId = dto.url.split(URL_DIVIDER)
                .filterNot {
                    it.isBlank()
                }.last()
            val pokemonDto = PokemonDto(dto.name, IMAGE_URL + pokemonId + IMAGE_SUFFIX)
            pokemonDto.indexInResponse = start + index
            pokemonDto
        }
}