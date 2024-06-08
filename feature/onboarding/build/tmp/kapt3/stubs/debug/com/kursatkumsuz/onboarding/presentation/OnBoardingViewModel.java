package com.kursatkumsuz.onboarding.presentation;

import androidx.lifecycle.ViewModel;
import com.kursatkumsuz.onboarding.domain.usecase.SaveOnBoardingStateUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/kursatkumsuz/onboarding/presentation/OnBoardingViewModel;", "Landroidx/lifecycle/ViewModel;", "saveOnBoardingStateUseCase", "Lcom/kursatkumsuz/onboarding/domain/usecase/SaveOnBoardingStateUseCase;", "(Lcom/kursatkumsuz/onboarding/domain/usecase/SaveOnBoardingStateUseCase;)V", "saveOnBoardingState", "", "onboarding_debug"})
public final class OnBoardingViewModel extends androidx.lifecycle.ViewModel {
    private final com.kursatkumsuz.onboarding.domain.usecase.SaveOnBoardingStateUseCase saveOnBoardingStateUseCase = null;
    
    @javax.inject.Inject
    public OnBoardingViewModel(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.onboarding.domain.usecase.SaveOnBoardingStateUseCase saveOnBoardingStateUseCase) {
        super();
    }
    
    public final void saveOnBoardingState() {
    }
}