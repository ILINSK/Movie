package com.kursatkumsuz.home.domain.repository;

import androidx.paging.PagingData;
import kotlinx.coroutines.flow.Flow;
import com.kursatkumsuz.home.data.model.Result;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/kursatkumsuz/home/domain/repository/MovieRepository;", "", "getNowPlayingMovies", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kursatkumsuz/home/data/model/Result;", "getPopularMovies", "getTopRatedMovies", "home_debug"})
public abstract interface MovieRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.kursatkumsuz.home.data.model.Result>> getTopRatedMovies();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.kursatkumsuz.home.data.model.Result>> getPopularMovies();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.kursatkumsuz.home.data.model.Result>> getNowPlayingMovies();
}