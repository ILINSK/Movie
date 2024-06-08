package com.kursatkumsuz.signin.presentation;

import androidx.compose.runtime.*;
import androidx.lifecycle.ViewModel;
import com.kursatkumsuz.signin.domain.usecase.SignInWithEmailAndPasswordUseCase;
import com.kursatkumsuz.util.Response;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J8\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/kursatkumsuz/signin/presentation/SignInViewModel;", "Landroidx/lifecycle/ViewModel;", "signInWithEmailAndPasswordUseCase", "Lcom/kursatkumsuz/signin/domain/usecase/SignInWithEmailAndPasswordUseCase;", "(Lcom/kursatkumsuz/signin/domain/usecase/SignInWithEmailAndPasswordUseCase;)V", "<set-?>", "Lcom/kursatkumsuz/signin/presentation/SignInUIState;", "state", "getState", "()Lcom/kursatkumsuz/signin/presentation/SignInUIState;", "setState", "(Lcom/kursatkumsuz/signin/presentation/SignInUIState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "signInWithEmailAndPassword", "", "email", "", "password", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "signin_debug"})
public final class SignInViewModel extends androidx.lifecycle.ViewModel {
    private final com.kursatkumsuz.signin.domain.usecase.SignInWithEmailAndPasswordUseCase signInWithEmailAndPasswordUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    @javax.inject.Inject
    public SignInViewModel(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.signin.domain.usecase.SignInWithEmailAndPasswordUseCase signInWithEmailAndPasswordUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.kursatkumsuz.signin.presentation.SignInUIState getState() {
        return null;
    }
    
    private final void setState(com.kursatkumsuz.signin.presentation.SignInUIState p0) {
    }
    
    public final void signInWithEmailAndPassword(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
    }
}