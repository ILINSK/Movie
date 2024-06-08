package com.kursatkumsuz.search.domain.usecase;

import androidx.paging.PagingData;
import com.kursatkumsuz.search.data.model.SearchResult;
import com.kursatkumsuz.search.domain.repository.SearchRepository;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/kursatkumsuz/search/domain/usecase/SearchMovieUseCase;", "", "searchRepository", "Lcom/kursatkumsuz/search/domain/repository/SearchRepository;", "(Lcom/kursatkumsuz/search/domain/repository/SearchRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kursatkumsuz/search/data/model/SearchResult;", "searchString", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search_debug"})
public final class SearchMovieUseCase {
    private final com.kursatkumsuz.search.domain.repository.SearchRepository searchRepository = null;
    
    @javax.inject.Inject
    public SearchMovieUseCase(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.search.domain.repository.SearchRepository searchRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.lang.String searchString, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.kursatkumsuz.search.data.model.SearchResult>>> continuation) {
        return null;
    }
}