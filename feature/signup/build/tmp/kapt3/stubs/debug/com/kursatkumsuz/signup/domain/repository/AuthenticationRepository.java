package com.kursatkumsuz.signup.domain.repository;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/kursatkumsuz/signup/domain/repository/AuthenticationRepository;", "", "getUserUid", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUpWithEmailAndPassword", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/auth/AuthResult;", "email", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signup_debug"})
public abstract interface AuthenticationRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUserUid(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object signUpWithEmailAndPassword(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult>> continuation);
}