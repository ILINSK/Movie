package com.kursatkumsuz.video.data.remote;

import com.kursatkumsuz.util.Constants;
import com.kursatkumsuz.video.model.MovieVideo;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/kursatkumsuz/video/data/remote/VideoApiService;", "", "getMovieVideos", "Lcom/kursatkumsuz/video/model/MovieVideo;", "movieId", "", "apiKey", "", "language", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "video_debug"})
public abstract interface VideoApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "movie/{movie_id}/videos")
    public abstract java.lang.Object getMovieVideos(@retrofit2.http.Path(value = "movie_id")
    int movieId, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.kursatkumsuz.video.model.MovieVideo> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}