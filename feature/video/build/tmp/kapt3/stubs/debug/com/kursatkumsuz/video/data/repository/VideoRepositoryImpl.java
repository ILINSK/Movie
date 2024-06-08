package com.kursatkumsuz.video.data.repository;

import com.kursatkumsuz.video.model.MovieVideo;
import com.kursatkumsuz.video.data.remote.VideoApiService;
import com.kursatkumsuz.video.domain.repository.VideoRepository;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/kursatkumsuz/video/data/repository/VideoRepositoryImpl;", "Lcom/kursatkumsuz/video/domain/repository/VideoRepository;", "videoApiService", "Lcom/kursatkumsuz/video/data/remote/VideoApiService;", "(Lcom/kursatkumsuz/video/data/remote/VideoApiService;)V", "getMovieVideo", "Lcom/kursatkumsuz/video/model/MovieVideo;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "video_debug"})
public final class VideoRepositoryImpl implements com.kursatkumsuz.video.domain.repository.VideoRepository {
    private final com.kursatkumsuz.video.data.remote.VideoApiService videoApiService = null;
    
    public VideoRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.video.data.remote.VideoApiService videoApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMovieVideo(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.kursatkumsuz.video.model.MovieVideo> continuation) {
        return null;
    }
}