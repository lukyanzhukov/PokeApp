package com.lukianbat.test.pokeapp.core.dagger.module.feature;

import com.lukianbat.test.pokeapp.core.dagger.scope.ActivityScope;
import com.lukianbat.test.pokeapp.feature.posts.presentation.PokemonListActivity;
import com.lukianbat.test.pokeapp.feature.posts.presentation.dagger.PostsActivityModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = RedditModule_RedditActivityInjector.PokemonListActivitySubcomponent.class)
public abstract class RedditModule_RedditActivityInjector {
  private RedditModule_RedditActivityInjector() {}

  @Binds
  @IntoMap
  @ClassKey(PokemonListActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PokemonListActivitySubcomponent.Factory builder);

  @Subcomponent(modules = PostsActivityModule.class)
  @ActivityScope
  public interface PokemonListActivitySubcomponent extends AndroidInjector<PokemonListActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PokemonListActivity> {}
  }
}
