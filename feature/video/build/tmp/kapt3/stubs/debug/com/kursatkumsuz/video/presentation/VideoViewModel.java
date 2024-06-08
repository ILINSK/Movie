package com.kursatkumsuz.video.presentation;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.kursatkumsuz.video.domain.usecase.GetMovieVideoUseCase;
import com.kursatkumsuz.util.Response;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/kursatkumsuz/video/presentation/VideoViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "getMovieVideoUseCase", "Lcom/kursatkumsuz/video/domain/usecase/GetMovieVideoUseCase;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/kursatkumsuz/video/domain/usecase/GetMovieVideoUseCase;)V", "<set-?>", "Landroidx/compose/runtime/MutableState;", "Lcom/kursatkumsuz/video/presentation/VideoUIState;", "state", "getState", "()Landroidx/compose/runtime/MutableState;", "loadVideo", "", "movieId", "", "video_debug"})
public final class VideoViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final com.kursatkumsuz.video.domain.usecase.GetMovieVideoUseCase getMovieVideoUseCase = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<com.kursatkumsuz.video.presentation.VideoUIState> state;
    
    @javax.inject.Inject
    public VideoViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull
    com.kursatkumsuz.video.domain.usecase.GetMovieVideoUseCase getMovieVideoUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.kursatkumsuz.video.presentation.VideoUIState> getState() {
        return null;
    }
    
    private final void loadVideo(int movieId) {
    }
}