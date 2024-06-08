package com.kursatkumsuz.signup.domain.repository;

import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.kursatkumsuz.domain.model.User;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/kursatkumsuz/signup/domain/repository/FirebaseStorageRepository;", "", "saveUser", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/firestore/DocumentReference;", "userUid", "", "user", "Lcom/kursatkumsuz/domain/model/User;", "(Ljava/lang/String;Lcom/kursatkumsuz/domain/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signup_debug"})
public abstract interface FirebaseStorageRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveUser(@org.jetbrains.annotations.NotNull
    java.lang.String userUid, @org.jetbrains.annotations.NotNull
    com.kursatkumsuz.domain.model.User user, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.google.android.gms.tasks.Task<com.google.firebase.firestore.DocumentReference>> continuation);
}