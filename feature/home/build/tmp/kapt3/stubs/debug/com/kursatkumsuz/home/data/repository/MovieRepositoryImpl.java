package com.kursatkumsuz.home.data.repository;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.kursatkumsuz.home.data.model.Result;
import com.kursatkumsuz.home.data.datasource.MovieDataSource;
import com.kursatkumsuz.home.data.remote.ApiService;
import com.kursatkumsuz.home.domain.repository.MovieRepository;
import com.kursatkumsuz.home.util.MovieType;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/kursatkumsuz/home/data/repository/MovieRepositoryImpl;", "Lcom/kursatkumsuz/home/domain/repository/MovieRepository;", "apiService", "Lcom/kursatkumsuz/home/data/remote/ApiService;", "(Lcom/kursatkumsuz/home/data/remote/ApiService;)V", "getNowPlayingMovies", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kursatkumsuz/home/data/model/Result;", "getPopularMovies", "getTopRatedMovies", "home_debug"})
public final class MovieRepositoryImpl implements com.kursatkumsuz.home.domain.repository.MovieRepository {
    private final com.kursatkumsuz.home.data.remote.ApiService apiService = null;
    
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.home.data.remote.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.kursatkumsuz.home.data.model.Result>> getTopRatedMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.kursatkumsuz.home.data.model.Result>> getPopularMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.kursatkumsuz.home.data.model.Result>> getNowPlayingMovies() {
        return null;
    }
}