package com.lukianbat.test.pokeapp.core.dagger.module

import com.lukianbat.test.pokeapp.core.dagger.module.feature.RedditModule
import dagger.Module
import dagger.android.support.AndroidSupportInjectionModule

@Module(
    includes = [
        AndroidSupportInjectionModule::class,
        RetrofitModule::class,
        RoomModule::class,
        RedditModule::class
    ]
)
interface ApplicationModule