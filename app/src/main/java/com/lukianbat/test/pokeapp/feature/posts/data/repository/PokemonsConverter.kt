package com.lukianbat.test.pokeapp.feature.posts.data.repository

import com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonCommonResponse
import com.lukianbat.test.pokeapp.feature.posts.domain.model.*
import javax.inject.Inject

interface PokemonsConverter {

    fun convert(
        response: List<PokemonCommonResponse>
    ): List<PokemonDto>
}

private const val IMAGE_URL =
    "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"
private const val URL_DIVIDER = '/'
private const val IMAGE_SUFFIX = ".png"

class PokemonsConverterImpl @Inject constructor() :
    PokemonsConverter {

    override fun convert(
        response: List<PokemonCommonResponse>
    ): List<PokemonDto> =
        response.map { res ->
            val dto = res.pokemonNetworkDto
            val detailDto = res.pokemonDetailNetworkDto
            val pokemonId = dto.url.split(URL_DIVIDER)
                .filterNot {
                    it.isBlank()
                }.last()
            val imageUrl = IMAGE_URL + pokemonId + IMAGE_SUFFIX
            val types = detailDto.types.map {
                it.type.name
            }
            val abilities = detailDto.abilities.map {
                it.ability.name
            }
            PokemonDto(
                dto.name,
                imageUrl,
                detailDto.stats[ATTACK_INDEX].base_stat,
                detailDto.stats[DEFENCE_INDEX].base_stat,
                detailDto.stats[HP_INDEX].base_stat,
                types,
                abilities,
                detailDto.height,
                detailDto.weight
            )
        }

    companion object {
        const val ATTACK_INDEX = 4
        const val DEFENCE_INDEX = 3
        const val HP_INDEX = 5
    }
}