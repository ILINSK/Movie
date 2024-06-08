package com.kursatkumsuz.home.presentation;

import androidx.lifecycle.ViewModel;
import androidx.paging.PagingData;
import com.kursatkumsuz.domain.model.User;
import com.kursatkumsuz.domain.usecase.UseCases;
import com.kursatkumsuz.home.domain.model.ResultHomeUI;
import com.kursatkumsuz.home.domain.usecase.HomeUseCases;
import com.kursatkumsuz.util.Response;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR6\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R6\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R6\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/kursatkumsuz/home/presentation/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "homeUseCases", "Lcom/kursatkumsuz/home/domain/usecase/HomeUseCases;", "useCase", "Lcom/kursatkumsuz/domain/usecase/UseCases;", "(Lcom/kursatkumsuz/home/domain/usecase/HomeUseCases;Lcom/kursatkumsuz/domain/usecase/UseCases;)V", "<set-?>", "Landroidx/compose/runtime/MutableState;", "", "imageState", "getImageState", "()Landroidx/compose/runtime/MutableState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/PagingData;", "Lcom/kursatkumsuz/home/domain/model/ResultHomeUI;", "nowPlayingMovieList", "getNowPlayingMovieList", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "popularMovieList", "getPopularMovieList", "topRatedMovieList", "getTopRatedMovieList", "Lcom/kursatkumsuz/domain/model/User;", "userState", "getUserState", "loadNowPlayingMovie", "", "loadPopularMovie", "loadProfileImage", "loadTopRatedMovie", "loadUserInformation", "home_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.kursatkumsuz.home.domain.usecase.HomeUseCases homeUseCases = null;
    private final com.kursatkumsuz.domain.usecase.UseCases useCase = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.String> imageState;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<com.kursatkumsuz.domain.model.User> userState;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.kursatkumsuz.home.domain.model.ResultHomeUI>> topRatedMovieList;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.kursatkumsuz.home.domain.model.ResultHomeUI>> popularMovieList;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.kursatkumsuz.home.domain.model.ResultHomeUI>> nowPlayingMovieList;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.home.domain.usecase.HomeUseCases homeUseCases, @org.jetbrains.annotations.NotNull
    com.kursatkumsuz.domain.usecase.UseCases useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getImageState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.kursatkumsuz.domain.model.User> getUserState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.kursatkumsuz.home.domain.model.ResultHomeUI>> getTopRatedMovieList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.kursatkumsuz.home.domain.model.ResultHomeUI>> getPopularMovieList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.kursatkumsuz.home.domain.model.ResultHomeUI>> getNowPlayingMovieList() {
        return null;
    }
    
    private final void loadTopRatedMovie() {
    }
    
    private final void loadUserInformation() {
    }
    
    private final void loadPopularMovie() {
    }
    
    private final void loadProfileImage() {
    }
    
    private final void loadNowPlayingMovie() {
    }
}