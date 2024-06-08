package com.kursatkumsuz.detail.presentation;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.kursatkumsuz.detail.domain.model.CastUI;
import com.kursatkumsuz.detail.domain.usecase.DetailUseCases;
import com.kursatkumsuz.domain.model.WatchListMovie;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J0\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00120\u001cR6\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/kursatkumsuz/detail/presentation/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "Lcom/kursatkumsuz/detail/domain/usecase/DetailUseCases;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/kursatkumsuz/detail/domain/usecase/DetailUseCases;Landroidx/lifecycle/SavedStateHandle;)V", "<set-?>", "Landroidx/compose/runtime/MutableState;", "", "Lcom/kursatkumsuz/detail/domain/model/CastUI;", "creditList", "getCreditList", "()Landroidx/compose/runtime/MutableState;", "Lcom/kursatkumsuz/detail/presentation/DetailUIState;", "state", "getState", "loadCast", "", "movieId", "", "loadMovie", "saveToWatchlist", "movie", "Lcom/kursatkumsuz/domain/model/WatchListMovie;", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "detail_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.kursatkumsuz.detail.domain.usecase.DetailUseCases useCases = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<com.kursatkumsuz.detail.presentation.DetailUIState> state;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.util.List<com.kursatkumsuz.detail.domain.model.CastUI>> creditList;
    
    @javax.inject.Inject
    public DetailViewModel(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.detail.domain.usecase.DetailUseCases useCases, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.kursatkumsuz.detail.presentation.DetailUIState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.kursatkumsuz.detail.domain.model.CastUI>> getCreditList() {
        return null;
    }
    
    private final void loadMovie(int movieId) {
    }
    
    private final void loadCast(int movieId) {
    }
    
    public final void saveToWatchlist(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.domain.model.WatchListMovie movie, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
    }
}