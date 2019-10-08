package com.lukianbat.test.pokeapp.feature.posts.presentation

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.lukianbat.test.pokeapp.BR
import com.lukianbat.test.pokeapp.R
import com.lukianbat.test.pokeapp.core.extensions.toast
import com.lukianbat.test.pokeapp.core.presentation.activity.EventsActivity
import com.lukianbat.test.pokeapp.databinding.ActivityPokemonListBinding
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto
import com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState
import com.lukianbat.test.pokeapp.feature.posts.presentation.recycler.PostsAdapter
import kotlinx.android.synthetic.main.activity_pokemon_list.*
import javax.inject.Inject

class PokemonListActivity :
    EventsActivity<ActivityPokemonListBinding, PokemonListViewModel, PokemonListViewModel.EventsListener>(),
    PokemonListViewModel.EventsListener {

    override fun showMessage(message: String) {
        toast(message)
    }

    override fun openPokemon(pokemonDto: PokemonDto) {
        val intent = Intent(this, PokemonActivity::class.java)
        val bundle = Bundle()
        bundle.putParcelable("POKEMON", pokemonDto)
        intent.putExtra("BUNDLE", bundle)
        startActivity(intent)
    }

    override val eventsListener: PokemonListViewModel.EventsListener = this

    override val viewModelVariableId: Int = BR.viewModel
    @Inject
    override lateinit var viewModel: PokemonListViewModel

    override val layoutId = R.layout.activity_pokemon_list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initAdapter()
        initSwipeToRefresh()
    }

    private fun initAdapter() {
        val adapter = PostsAdapter {
            viewModel.retry()
        }
        adapter.setOnItemClickListener(viewModel)
        list.adapter = adapter
        viewModel.posts.observe(this, Observer<PagedList<PokemonDto>> {
            adapter.submitList(it)
        })
        viewModel.networkState.observe(this, Observer {
            adapter.setNetworkState(it)
        })
    }

    private fun initSwipeToRefresh() {
        viewModel.refreshState.observe(this, Observer {
            swipe_refresh.isRefreshing = it == NetworkState.LOADING
        })
        swipe_refresh.setOnRefreshListener {
            viewModel.refresh()
        }
    }
}
