package com.lukianbat.test.pokeapp.core.dagger.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\f\u0010\f\u001a\u00020\r*\u00020\rH\u0002\u00a8\u0006\u000e"}, d2 = {"Lcom/lukianbat/test/pokeapp/core/dagger/module/RetrofitModule;", "", "()V", "getHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "getLoggingInterceptorLogger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "providePokemonRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "applyLoggingForDebug", "Lokhttp3/OkHttpClient$Builder;", "app_debug"})
@dagger.Module()
public final class RetrofitModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit providePokemonRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    private final okhttp3.OkHttpClient.Builder applyLoggingForDebug(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient.Builder $this$applyLoggingForDebug) {
        return null;
    }
    
    private final okhttp3.logging.HttpLoggingInterceptor getHttpLoggingInterceptor() {
        return null;
    }
    
    private final okhttp3.logging.HttpLoggingInterceptor.Logger getLoggingInterceptorLogger() {
        return null;
    }
    
    public RetrofitModule() {
        super();
    }
}