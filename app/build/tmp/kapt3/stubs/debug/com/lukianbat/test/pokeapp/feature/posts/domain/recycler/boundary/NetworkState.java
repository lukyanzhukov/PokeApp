package com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary;

import java.lang.System;

@kotlin.Suppress(names = {"DataClassPrivateConstructor"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/NetworkState;", "", "status", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/Status;", "msg", "", "(Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/Status;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "getStatus", "()Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/Status;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_debug"})
public final class NetworkState {
    @org.jetbrains.annotations.NotNull()
    private final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String msg = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState LOADED = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState LOADING = null;
    public static final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMsg() {
        return null;
    }
    
    private NetworkState(com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Status status, java.lang.String msg) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Status component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState copy(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Status status, @org.jetbrains.annotations.Nullable()
    java.lang.String msg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/NetworkState$Companion;", "", "()V", "LOADED", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/NetworkState;", "getLOADED", "()Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/NetworkState;", "LOADING", "getLOADING", "error", "msg", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState getLOADED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState getLOADING() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState error(@org.jetbrains.annotations.Nullable()
        java.lang.String msg) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}