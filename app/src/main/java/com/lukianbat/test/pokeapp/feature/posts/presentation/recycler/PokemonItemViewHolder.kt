package com.lukianbat.test.pokeapp.feature.posts.presentation.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lukianbat.test.pokeapp.R
import com.lukianbat.test.pokeapp.core.extensions.Duration
import com.lukianbat.test.pokeapp.core.extensions.load
import com.lukianbat.test.pokeapp.core.extensions.showMessage
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto
import com.squareup.picasso.Picasso

class PokemonItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val name: TextView = view.findViewById(R.id.pokemonName)
    private val image: ImageView = view.findViewById(R.id.pokemonImage)
    private var post: PokemonDto? = null

    init {
        view.setOnClickListener {
            it.context.showMessage(
                (post?.name ?: "pokemon") + " attack = " + post?.attack.toString(),
                Duration.SHORT
            )
        }
    }

    fun bind(post: PokemonDto?) {
        this.post = post
        name.text = post?.name ?: "loading"
        post?.url?.let { image.load(it, R.drawable.ic_pokeball_pokemon, Picasso.get()) }
    }

    companion object {
        fun create(parent: ViewGroup): PokemonItemViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.pokemon_item, parent, false)
            return PokemonItemViewHolder(view)
        }
    }

    fun updateScore(item: PokemonDto?) {
        post = item
    }
}