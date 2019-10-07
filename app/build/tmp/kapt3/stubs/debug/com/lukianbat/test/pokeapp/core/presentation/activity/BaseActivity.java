package com.lukianbat.test.pokeapp.core.presentation.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u0010\u0010\u0007\u001a\u00028\u0000X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00028\u0001X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\nX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/lukianbat/test/pokeapp/core/presentation/activity/BaseActivity;", "DB", "Landroidx/databinding/ViewDataBinding;", "VM", "Landroidx/lifecycle/ViewModel;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "binding", "Landroidx/databinding/ViewDataBinding;", "layoutId", "", "getLayoutId", "()I", "viewModel", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "viewModelVariableId", "getViewModelVariableId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseActivity<DB extends androidx.databinding.ViewDataBinding, VM extends androidx.lifecycle.ViewModel> extends dagger.android.support.DaggerAppCompatActivity {
    private DB binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected abstract VM getViewModel();
    
    protected abstract int getLayoutId();
    
    protected abstract int getViewModelVariableId();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public BaseActivity() {
        super();
    }
}