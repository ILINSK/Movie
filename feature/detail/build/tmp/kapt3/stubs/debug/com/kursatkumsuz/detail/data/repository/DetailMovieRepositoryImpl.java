package com.kursatkumsuz.detail.data.repository;

import com.kursatkumsuz.detail.data.model.credit.Credit;
import com.kursatkumsuz.detail.data.model.detail.MovieDetail;
import com.kursatkumsuz.detail.domain.repository.DetailMovieRepository;
import com.kursatkumsuz.detail.data.remote.DetailApiService;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/kursatkumsuz/detail/data/repository/DetailMovieRepositoryImpl;", "Lcom/kursatkumsuz/detail/domain/repository/DetailMovieRepository;", "detailApiService", "Lcom/kursatkumsuz/detail/data/remote/DetailApiService;", "(Lcom/kursatkumsuz/detail/data/remote/DetailApiService;)V", "getCredit", "Lcom/kursatkumsuz/detail/data/model/credit/Credit;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetail", "Lcom/kursatkumsuz/detail/data/model/detail/MovieDetail;", "detail_debug"})
public final class DetailMovieRepositoryImpl implements com.kursatkumsuz.detail.domain.repository.DetailMovieRepository {
    private final com.kursatkumsuz.detail.data.remote.DetailApiService detailApiService = null;
    
    public DetailMovieRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.detail.data.remote.DetailApiService detailApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMovieDetail(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.kursatkumsuz.detail.data.model.detail.MovieDetail> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCredit(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.kursatkumsuz.detail.data.model.credit.Credit> continuation) {
        return null;
    }
}