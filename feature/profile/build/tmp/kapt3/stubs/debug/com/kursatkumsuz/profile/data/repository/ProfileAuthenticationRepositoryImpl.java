package com.kursatkumsuz.profile.data.repository;

import com.google.firebase.auth.FirebaseAuth;
import com.kursatkumsuz.profile.domain.repository.ProfileAuthenticationRepository;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/kursatkumsuz/profile/data/repository/ProfileAuthenticationRepositoryImpl;", "Lcom/kursatkumsuz/profile/domain/repository/ProfileAuthenticationRepository;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "signOut", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "profile_debug"})
public final class ProfileAuthenticationRepositoryImpl implements com.kursatkumsuz.profile.domain.repository.ProfileAuthenticationRepository {
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    
    public ProfileAuthenticationRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth firebaseAuth) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object signOut(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}