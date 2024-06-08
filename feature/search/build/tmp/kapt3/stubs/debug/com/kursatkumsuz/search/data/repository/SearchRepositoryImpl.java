package com.kursatkumsuz.search.data.repository;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.kursatkumsuz.search.data.datasource.SearchDataSource;
import com.kursatkumsuz.search.data.model.SearchResult;
import com.kursatkumsuz.search.data.remote.SearchApiService;
import com.kursatkumsuz.search.domain.repository.SearchRepository;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/kursatkumsuz/search/data/repository/SearchRepositoryImpl;", "Lcom/kursatkumsuz/search/domain/repository/SearchRepository;", "searchApiService", "Lcom/kursatkumsuz/search/data/remote/SearchApiService;", "(Lcom/kursatkumsuz/search/data/remote/SearchApiService;)V", "searchMovie", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kursatkumsuz/search/data/model/SearchResult;", "searchString", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search_debug"})
public final class SearchRepositoryImpl implements com.kursatkumsuz.search.domain.repository.SearchRepository {
    private final com.kursatkumsuz.search.data.remote.SearchApiService searchApiService = null;
    
    public SearchRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.search.data.remote.SearchApiService searchApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object searchMovie(@org.jetbrains.annotations.NotNull
    java.lang.String searchString, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.kursatkumsuz.search.data.model.SearchResult>>> continuation) {
        return null;
    }
}