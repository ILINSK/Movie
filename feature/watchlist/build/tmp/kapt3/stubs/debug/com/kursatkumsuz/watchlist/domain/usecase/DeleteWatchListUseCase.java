package com.kursatkumsuz.watchlist.domain.usecase;

import com.kursatkumsuz.util.Response;
import com.kursatkumsuz.watchlist.domain.repository.WatchListRepository;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/kursatkumsuz/watchlist/domain/usecase/DeleteWatchListUseCase;", "", "watchListRepository", "Lcom/kursatkumsuz/watchlist/domain/repository/WatchListRepository;", "(Lcom/kursatkumsuz/watchlist/domain/repository/WatchListRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kursatkumsuz/util/Response;", "Ljava/lang/Void;", "movieId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "watchlist_debug"})
public final class DeleteWatchListUseCase {
    private final com.kursatkumsuz.watchlist.domain.repository.WatchListRepository watchListRepository = null;
    
    public DeleteWatchListUseCase(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.watchlist.domain.repository.WatchListRepository watchListRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.lang.String movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.kursatkumsuz.util.Response<java.lang.Void>>> continuation) {
        return null;
    }
}