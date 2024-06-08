package com.kursatkumsuz.detail.domain.usecase;

import com.kursatkumsuz.detail.domain.repository.FirebaseRepository;
import com.kursatkumsuz.domain.model.WatchListMovie;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\t0\b2\u0006\u0010\f\u001a\u00020\rH\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/kursatkumsuz/detail/domain/usecase/SaveMovieToWatchlistUseCase;", "", "firebaseRepository", "Lcom/kursatkumsuz/detail/domain/repository/FirebaseRepository;", "(Lcom/kursatkumsuz/detail/domain/repository/FirebaseRepository;)V", "getFirebaseRepository", "()Lcom/kursatkumsuz/detail/domain/repository/FirebaseRepository;", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kursatkumsuz/util/Response;", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "movie", "Lcom/kursatkumsuz/domain/model/WatchListMovie;", "detail_debug"})
public final class SaveMovieToWatchlistUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.kursatkumsuz.detail.domain.repository.FirebaseRepository firebaseRepository = null;
    
    public SaveMovieToWatchlistUseCase(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.detail.domain.repository.FirebaseRepository firebaseRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.kursatkumsuz.detail.domain.repository.FirebaseRepository getFirebaseRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.kursatkumsuz.util.Response<com.google.android.gms.tasks.Task<java.lang.Void>>> invoke(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.domain.model.WatchListMovie movie) {
        return null;
    }
}