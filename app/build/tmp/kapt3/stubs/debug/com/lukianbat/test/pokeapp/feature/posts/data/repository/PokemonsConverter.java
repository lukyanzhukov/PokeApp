package com.lukianbat.test.pokeapp.feature.posts.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/repository/PokemonsConverter;", "", "convert", "", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDto;", "response", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/model/PokemonCommonResponse;", "start", "", "app_debug"})
public abstract interface PokemonsConverter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> convert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonCommonResponse> response, int start);
}