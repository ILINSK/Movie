package com.kursatkumsuz.signup.data.repository;

import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.kursatkumsuz.domain.model.User;
import com.kursatkumsuz.signup.domain.repository.FirebaseStorageRepository;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/kursatkumsuz/signup/data/repository/FirebaseStorageRepositoryImpl;", "Lcom/kursatkumsuz/signup/domain/repository/FirebaseStorageRepository;", "firebaseFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "saveUser", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/firestore/DocumentReference;", "userUid", "", "user", "Lcom/kursatkumsuz/domain/model/User;", "(Ljava/lang/String;Lcom/kursatkumsuz/domain/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signup_debug"})
public final class FirebaseStorageRepositoryImpl implements com.kursatkumsuz.signup.domain.repository.FirebaseStorageRepository {
    private final com.google.firebase.firestore.FirebaseFirestore firebaseFirestore = null;
    
    public FirebaseStorageRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firebaseFirestore) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveUser(@org.jetbrains.annotations.NotNull
    java.lang.String userUid, @org.jetbrains.annotations.NotNull
    com.kursatkumsuz.domain.model.User user, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.google.android.gms.tasks.Task<com.google.firebase.firestore.DocumentReference>> continuation) {
        return null;
    }
}