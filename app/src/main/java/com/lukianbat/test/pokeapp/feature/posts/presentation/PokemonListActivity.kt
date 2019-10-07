package com.lukianbat.test.pokeapp.feature.posts.presentation

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.lukianbat.test.pokeapp.BR
import com.lukianbat.test.pokeapp.R
import com.lukianbat.test.pokeapp.core.presentation.activity.BaseActivity
import com.lukianbat.test.pokeapp.databinding.ActivityPokemonListBinding
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto
import com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState
import com.lukianbat.test.pokeapp.feature.posts.presentation.recycler.PostsAdapter
import kotlinx.android.synthetic.main.activity_pokemon_list.*
import javax.inject.Inject

class PokemonListActivity :
    BaseActivity<ActivityPokemonListBinding, PokemonListViewModel>() {

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
