package com.kursatkumsuz.video.domain.usecase;

import com.kursatkumsuz.video.domain.repository.VideoRepository;
import com.kursatkumsuz.util.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/kursatkumsuz/video/domain/usecase/GetMovieVideoUseCase;", "", "videoRepository", "Lcom/kursatkumsuz/video/domain/repository/VideoRepository;", "(Lcom/kursatkumsuz/video/domain/repository/VideoRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kursatkumsuz/util/Response;", "Lcom/kursatkumsuz/video/model/MovieVideo;", "movieId", "", "video_debug"})
public final class GetMovieVideoUseCase {
    private final com.kursatkumsuz.video.domain.repository.VideoRepository videoRepository = null;
    
    @javax.inject.Inject
    public GetMovieVideoUseCase(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.video.domain.repository.VideoRepository videoRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.kursatkumsuz.util.Response<com.kursatkumsuz.video.model.MovieVideo>> invoke(int movieId) {
        return null;
    }
}