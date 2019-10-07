package com.lukianbat.test.pokeapp.core.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u0006\u001a*\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\u001a\u001c\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003\u001a*\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\u001a\u001c\u0010\f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003\u001a>\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u001d\u0010\u000e\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f\u00a2\u0006\u0002\b\u0011H\u0086\b\u00a8\u0006\u0012"}, d2 = {"add", "", "T", "Landroidx/lifecycle/MutableLiveData;", "", "newItem", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "addAll", "newItems", "", "clear", "clearAndFill", "removeLast", "transaction", "action", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "app_debug"})
public final class MutableLiveDataExtensionsKt {
    
    public static final <T extends java.lang.Object>void clearAndFill(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$clearAndFill, @org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends T> newItems) {
    }
    
    public static final <T extends java.lang.Object>void addAll(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$addAll, @org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends T> newItems) {
    }
    
    public static final <T extends java.lang.Object>void add(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$add, T newItem) {
    }
    
    public static final <T extends java.lang.Object>void removeLast(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$removeLast) {
    }
    
    public static final <T extends java.lang.Object>void clear(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$clear) {
    }
    
    public static final <T extends java.lang.Object>void transaction(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$transaction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<T>, kotlin.Unit> action) {
    }
}