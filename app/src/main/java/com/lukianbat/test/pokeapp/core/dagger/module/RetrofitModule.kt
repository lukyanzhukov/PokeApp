package com.lukianbat.test.pokeapp.core.dagger.module

import com.lukianbat.test.pokeapp.BuildConfig
import com.lukianbat.test.pokeapp.core.extensions.info
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import javax.inject.Named

@Module
class RetrofitModule {

    @Provides
    fun providePokemonRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.SERVER_API_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    @Provides
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient.Builder()
        .applyLoggingForDebug()
        .build()

    private fun OkHttpClient.Builder.applyLoggingForDebug(): OkHttpClient.Builder =
        if (BuildConfig.DEBUG) {
            addNetworkInterceptor(getHttpLoggingInterceptor())
        } else {
            this
        }

    private fun getHttpLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor(getLoggingInterceptorLogger())
            .apply { level = HttpLoggingInterceptor.Level.BODY }

    private fun getLoggingInterceptorLogger() =
        HttpLoggingInterceptor.Logger { message -> info(message) }
}