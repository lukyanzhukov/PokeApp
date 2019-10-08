package com.lukianbat.test.pokeapp.feature.posts.presentation

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import com.lukianbat.test.pokeapp.R
import com.lukianbat.test.pokeapp.core.presentation.activity.SimpleActivity
import com.lukianbat.test.pokeapp.databinding.ActivityPokemonBinding
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto

class PokemonActivity : SimpleActivity<ActivityPokemonBinding>() {

    val pokemon = MutableLiveData<PokemonDto>()
    override val layoutId: Int = R.layout.activity_pokemon
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bundle = intent.getBundleExtra("BUNDLE")
        pokemon.value = bundle.getParcelable("POKEMON") as PokemonDto
    }
}