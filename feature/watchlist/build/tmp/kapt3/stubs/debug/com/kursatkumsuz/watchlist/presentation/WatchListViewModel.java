package com.kursatkumsuz.watchlist.presentation;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.ViewModel;
import com.kursatkumsuz.domain.model.WatchListMovie;
import com.kursatkumsuz.watchlist.domain.usecase.WatchListUseCases;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u0012J\b\u0010\u0013\u001a\u00020\fH\u0002R*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/kursatkumsuz/watchlist/presentation/WatchListViewModel;", "Landroidx/lifecycle/ViewModel;", "watchListUseCases", "Lcom/kursatkumsuz/watchlist/domain/usecase/WatchListUseCases;", "(Lcom/kursatkumsuz/watchlist/domain/usecase/WatchListUseCases;)V", "<set-?>", "Landroidx/compose/runtime/MutableState;", "Lcom/kursatkumsuz/watchlist/presentation/WatchListUIState;", "state", "getState", "()Landroidx/compose/runtime/MutableState;", "deleteWatchList", "", "movieId", "", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "loadWatchlist", "watchlist_debug"})
public final class WatchListViewModel extends androidx.lifecycle.ViewModel {
    private final com.kursatkumsuz.watchlist.domain.usecase.WatchListUseCases watchListUseCases = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<com.kursatkumsuz.watchlist.presentation.WatchListUIState> state;
    
    @javax.inject.Inject
    public WatchListViewModel(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.watchlist.domain.usecase.WatchListUseCases watchListUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.kursatkumsuz.watchlist.presentation.WatchListUIState> getState() {
        return null;
    }
    
    private final void loadWatchlist() {
    }
    
    public final void deleteWatchList(@org.jetbrains.annotations.NotNull
    java.lang.String movieId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
    }
}