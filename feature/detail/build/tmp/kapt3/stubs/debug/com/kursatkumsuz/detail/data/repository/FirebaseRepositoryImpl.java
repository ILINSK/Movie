package com.kursatkumsuz.detail.data.repository;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.kursatkumsuz.domain.model.WatchListMovie;
import com.kursatkumsuz.detail.domain.repository.FirebaseRepository;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/kursatkumsuz/detail/data/repository/FirebaseRepositoryImpl;", "Lcom/kursatkumsuz/detail/domain/repository/FirebaseRepository;", "firebaseFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/auth/FirebaseAuth;)V", "getUserUid", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMovie", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "movie", "Lcom/kursatkumsuz/domain/model/WatchListMovie;", "(Lcom/kursatkumsuz/domain/model/WatchListMovie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detail_debug"})
public final class FirebaseRepositoryImpl implements com.kursatkumsuz.detail.domain.repository.FirebaseRepository {
    private final com.google.firebase.firestore.FirebaseFirestore firebaseFirestore = null;
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    
    public FirebaseRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firebaseFirestore, @org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth firebaseAuth) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getUserUid(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveMovie(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.domain.model.WatchListMovie movie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.google.android.gms.tasks.Task<java.lang.Void>> continuation) {
        return null;
    }
}