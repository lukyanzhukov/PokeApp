package com.lukianbat.test.pokeapp.feature.posts.presentation

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.lukianbat.test.pokeapp.BR
import com.lukianbat.test.pokeapp.BuildConfig
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

    @Inject
    override lateinit var viewModel: PokemonListViewModel

    private lateinit var adapter: PostsAdapter
    override val eventsListener: PokemonListViewModel.EventsListener = this
    override val viewModelVariableId: Int = BR.viewModel
    override val layoutId = R.layout.activity_pokemon_list

    override fun showMessage(message: String) {
        toast(message)
    }

    override fun openPokemon(pokemonDto: PokemonDto) {
        val intent = Intent(this, PokemonActivity::class.java)
        val bundle = Bundle()
        bundle.putParcelable(BuildConfig.POKEMON_KEY, pokemonDto)
        intent.putExtra(BuildConfig.BUNDLE_KEY, bundle)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initAdapter()
        initSwipeToRefresh()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.sort_by_attack -> {
                removeObservers()
                viewModel.sortByAttack()
                initAdapter()
                initSwipeToRefresh()
                true
            }
            R.id.sort_by_defence -> {
                removeObservers()
                viewModel.sortByDefence()
                initAdapter()
                initSwipeToRefresh()
                true
            }
            R.id.sort_by_hp -> {
                removeObservers()
                viewModel.sortByHp()
                initAdapter()
                initSwipeToRefresh()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.sort_menu, menu)
        return true
    }

    private fun removeObservers() {
        viewModel.posts.removeObservers(this)
        viewModel.networkState.removeObservers(this)
        viewModel.refreshState.removeObservers(this)
    }

    private fun initAdapter() {
        adapter = PostsAdapter {
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

    fun onFabClick(view: View) {
        removeObservers()
        viewModel.randsPokemons()
        initAdapter()
        initSwipeToRefresh()
    }
}
