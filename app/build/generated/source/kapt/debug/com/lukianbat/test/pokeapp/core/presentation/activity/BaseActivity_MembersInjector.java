// Generated by Dagger (https://google.github.io/dagger).
package com.lukianbat.test.pokeapp.core.presentation.activity;

import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.inject.Provider;

public final class BaseActivity_MembersInjector<DB extends ViewDataBinding, VM extends ViewModel>
    implements MembersInjector<BaseActivity<DB, VM>> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  public BaseActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>>
          frameworkFragmentInjectorProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
  }

  public static <DB extends ViewDataBinding, VM extends ViewModel>
      MembersInjector<BaseActivity<DB, VM>> create(
          Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
          Provider<DispatchingAndroidInjector<android.app.Fragment>>
              frameworkFragmentInjectorProvider) {
    return new BaseActivity_MembersInjector<DB, VM>(
        supportFragmentInjectorProvider, frameworkFragmentInjectorProvider);
  }

  @Override
  public void injectMembers(BaseActivity<DB, VM> instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
  }
}
