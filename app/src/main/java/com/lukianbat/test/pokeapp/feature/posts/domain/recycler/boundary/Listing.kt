package com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary

import androidx.lifecycle.LiveData
import androidx.paging.PagedList

data class Listing<T>(

    var pagedList: LiveData<PagedList<T>>,

    val networkState: LiveData<NetworkState>,

    val refreshState: LiveData<NetworkState>,

    val refresh: () -> Unit,

    val retry: () -> Unit
)