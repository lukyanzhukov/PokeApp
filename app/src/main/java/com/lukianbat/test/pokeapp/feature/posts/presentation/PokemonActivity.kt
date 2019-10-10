package com.lukianbat.test.pokeapp.feature.posts.presentation

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import com.lukianbat.test.pokeapp.BuildConfig
import com.lukianbat.test.pokeapp.R
import com.lukianbat.test.pokeapp.core.presentation.activity.SimpleActivity
import com.lukianbat.test.pokeapp.databinding.ActivityPokemonBinding
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto
import com.squareup.picasso.Picasso

class PokemonActivity : SimpleActivity<ActivityPokemonBinding>() {

    val pokemon = MutableLiveData<PokemonDto>()
    override val layoutId: Int = R.layout.activity_pokemon

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bundle = intent.getBundleExtra(BuildConfig.BUNDLE_KEY)
        pokemon.value = bundle.getParcelable(BuildConfig.POKEMON_KEY) as PokemonDto
    }
}