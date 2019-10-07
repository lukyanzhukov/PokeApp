package com.lukianbat.test.pokeapp.feature.posts.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/domain/usecase/GetPokemonListUseCaseImpl;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/usecase/GetPokemonListUseCase;", "repository", "Lcom/lukianbat/test/pokeapp/feature/posts/data/repository/PokemonsRepository;", "(Lcom/lukianbat/test/pokeapp/feature/posts/data/repository/PokemonsRepository;)V", "getPosts", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/Listing;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDto;", "app_debug"})
public final class GetPokemonListUseCaseImpl implements com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonListUseCase {
    private final com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.Listing<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> getPosts() {
        return null;
    }
    
    @javax.inject.Inject()
    public GetPokemonListUseCaseImpl(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsRepository repository) {
        super();
    }
}