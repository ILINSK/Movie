package com.kursatkumsuz.splash.presentation;

import androidx.compose.runtime.*;
import androidx.lifecycle.ViewModel;
import com.kursatkumsuz.splash.domain.usecase.SplashUseCases;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\u0012H\u0002J\b\u0010\u000f\u001a\u00020\u0012H\u0002R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/kursatkumsuz/splash/presentation/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "splashUseCases", "Lcom/kursatkumsuz/splash/domain/usecase/SplashUseCases;", "(Lcom/kursatkumsuz/splash/domain/usecase/SplashUseCases;)V", "<set-?>", "", "onBoardingState", "getOnBoardingState", "()Z", "setOnBoardingState", "(Z)V", "onBoardingState$delegate", "Landroidx/compose/runtime/MutableState;", "signedInState", "getSignedInState", "setSignedInState", "signedInState$delegate", "", "splash_debug"})
public final class SplashViewModel extends androidx.lifecycle.ViewModel {
    private final com.kursatkumsuz.splash.domain.usecase.SplashUseCases splashUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState onBoardingState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState signedInState$delegate = null;
    
    @javax.inject.Inject
    public SplashViewModel(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.splash.domain.usecase.SplashUseCases splashUseCases) {
        super();
    }
    
    public final boolean getOnBoardingState() {
        return false;
    }
    
    private final void setOnBoardingState(boolean p0) {
    }
    
    public final boolean getSignedInState() {
        return false;
    }
    
    private final void setSignedInState(boolean p0) {
    }
    
    private final void getOnBoardingState() {
    }
    
    private final void getSignedInState() {
    }
}