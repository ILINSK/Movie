package com.kursatkumsuz.signup.presentation;

import androidx.compose.runtime.*;
import androidx.lifecycle.ViewModel;
import com.kursatkumsuz.domain.model.User;
import com.kursatkumsuz.signup.domain.usecase.SignUpUseCases;
import com.kursatkumsuz.util.Response;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J8\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J8\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u0014R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/kursatkumsuz/signup/presentation/SignUpViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcom/kursatkumsuz/signup/domain/usecase/SignUpUseCases;", "(Lcom/kursatkumsuz/signup/domain/usecase/SignUpUseCases;)V", "<set-?>", "", "loadingState", "getLoadingState", "()Z", "setLoadingState", "(Z)V", "loadingState$delegate", "Landroidx/compose/runtime/MutableState;", "saveUser", "", "name", "", "email", "onError", "Lkotlin/Function1;", "onSuccess", "Lkotlin/Function0;", "setLoading", "isLoading", "signUpWithEmailAndPassword", "password", "signup_debug"})
public final class SignUpViewModel extends androidx.lifecycle.ViewModel {
    private final com.kursatkumsuz.signup.domain.usecase.SignUpUseCases useCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState loadingState$delegate = null;
    
    @javax.inject.Inject
    public SignUpViewModel(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.signup.domain.usecase.SignUpUseCases useCase) {
        super();
    }
    
    public final boolean getLoadingState() {
        return false;
    }
    
    private final void setLoadingState(boolean p0) {
    }
    
    private final void setLoading(boolean isLoading) {
    }
    
    public final void signUpWithEmailAndPassword(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
    }
    
    public final void saveUser(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess) {
    }
}