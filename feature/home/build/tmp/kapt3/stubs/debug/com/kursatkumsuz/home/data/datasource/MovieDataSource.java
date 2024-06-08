package com.kursatkumsuz.home.data.datasource;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.kursatkumsuz.home.data.model.Result;
import com.kursatkumsuz.home.data.remote.ApiService;
import com.kursatkumsuz.home.util.MovieType;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000bH\u0016\u00a2\u0006\u0002\u0010\fJ+\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/kursatkumsuz/home/data/datasource/MovieDataSource;", "Landroidx/paging/PagingSource;", "", "Lcom/kursatkumsuz/home/data/model/Result;", "apiService", "Lcom/kursatkumsuz/home/data/remote/ApiService;", "movieType", "Lcom/kursatkumsuz/home/util/MovieType;", "(Lcom/kursatkumsuz/home/data/remote/ApiService;Lcom/kursatkumsuz/home/util/MovieType;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "home_debug"})
public final class MovieDataSource extends androidx.paging.PagingSource<java.lang.Integer, com.kursatkumsuz.home.data.model.Result> {
    private final com.kursatkumsuz.home.data.remote.ApiService apiService = null;
    private final com.kursatkumsuz.home.util.MovieType movieType = null;
    
    public MovieDataSource(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.home.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull
    com.kursatkumsuz.home.util.MovieType movieType) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object load(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.kursatkumsuz.home.data.model.Result>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingState<java.lang.Integer, com.kursatkumsuz.home.data.model.Result> state) {
        return null;
    }
}