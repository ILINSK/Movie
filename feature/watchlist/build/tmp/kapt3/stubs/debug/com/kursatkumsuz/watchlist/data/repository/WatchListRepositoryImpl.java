package com.kursatkumsuz.watchlist.data.repository;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;
import com.kursatkumsuz.watchlist.domain.repository.WatchListRepository;
import com.kursatkumsuz.util.Constants;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/kursatkumsuz/watchlist/data/repository/WatchListRepositoryImpl;", "Lcom/kursatkumsuz/watchlist/domain/repository/WatchListRepository;", "firebaseFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/auth/FirebaseAuth;)V", "deleteMovie", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "movieId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovies", "Lcom/google/firebase/firestore/QuerySnapshot;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserUid", "watchlist_debug"})
public final class WatchListRepositoryImpl implements com.kursatkumsuz.watchlist.domain.repository.WatchListRepository {
    private final com.google.firebase.firestore.FirebaseFirestore firebaseFirestore = null;
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    
    public WatchListRepositoryImpl(@org.jetbrains.annotations.NotNull
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
    public java.lang.Object deleteMovie(@org.jetbrains.annotations.NotNull
    java.lang.String movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.google.android.gms.tasks.Task<java.lang.Void>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMovies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.google.android.gms.tasks.Task<com.google.firebase.firestore.QuerySnapshot>> continuation) {
        return null;
    }
}