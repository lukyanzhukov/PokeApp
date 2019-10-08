package com.lukianbat.test.pokeapp.feature.posts.presentation.recycler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rH\u0016J&\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/presentation/recycler/PostsAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDto;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "retryCallback", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "networkState", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/NetworkState;", "onItemClickListener", "Lcom/lukianbat/test/pokeapp/feature/posts/presentation/recycler/OnItemClickListener;", "getItemCount", "", "getItemViewType", "position", "hasExtraRow", "", "onBindViewHolder", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNetworkState", "newNetworkState", "setOnItemClickListener", "Companion", "app_debug"})
public final class PostsAdapter extends androidx.paging.PagedListAdapter<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState networkState;
    private com.lukianbat.test.pokeapp.feature.posts.presentation.recycler.OnItemClickListener onItemClickListener;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> retryCallback = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> POST_COMPARATOR = null;
    public static final com.lukianbat.test.pokeapp.feature.posts.presentation.recycler.PostsAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final boolean hasExtraRow() {
        return false;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setNetworkState(@org.jetbrains.annotations.Nullable()
    com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState newNetworkState) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.presentation.recycler.OnItemClickListener onItemClickListener) {
    }
    
    public PostsAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> retryCallback) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/presentation/recycler/PostsAdapter$Companion;", "", "()V", "POST_COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDto;", "getPOST_COMPARATOR", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> getPOST_COMPARATOR() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}