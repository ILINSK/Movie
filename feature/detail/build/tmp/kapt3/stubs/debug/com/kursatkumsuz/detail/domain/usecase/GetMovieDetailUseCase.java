package com.kursatkumsuz.detail.domain.usecase;

import com.kursatkumsuz.detail.domain.repository.DetailMovieRepository;
import com.kursatkumsuz.util.Response;
import retrofit2.HttpException;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/kursatkumsuz/detail/domain/usecase/GetMovieDetailUseCase;", "", "detailMovieRepository", "Lcom/kursatkumsuz/detail/domain/repository/DetailMovieRepository;", "(Lcom/kursatkumsuz/detail/domain/repository/DetailMovieRepository;)V", "getDetailMovieRepository", "()Lcom/kursatkumsuz/detail/domain/repository/DetailMovieRepository;", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kursatkumsuz/util/Response;", "Lcom/kursatkumsuz/detail/domain/model/MovieDetailUI;", "movieId", "", "detail_debug"})
public final class GetMovieDetailUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.kursatkumsuz.detail.domain.repository.DetailMovieRepository detailMovieRepository = null;
    
    public GetMovieDetailUseCase(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.detail.domain.repository.DetailMovieRepository detailMovieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.kursatkumsuz.detail.domain.repository.DetailMovieRepository getDetailMovieRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.kursatkumsuz.util.Response<com.kursatkumsuz.detail.domain.model.MovieDetailUI>> invoke(int movieId) {
        return null;
    }
}