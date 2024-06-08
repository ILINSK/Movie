package com.kursatkumsuz.profile.data.repository;

import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.UploadTask;
import com.kursatkumsuz.profile.domain.repository.ImageRepository;
import com.kursatkumsuz.util.Constants;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u000f\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/kursatkumsuz/profile/data/repository/ImageRepositoryImpl;", "Lcom/kursatkumsuz/profile/domain/repository/ImageRepository;", "firebaseFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "firebaseStorage", "Lcom/google/firebase/storage/FirebaseStorage;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/storage/FirebaseStorage;Lcom/google/firebase/auth/FirebaseAuth;)V", "getUserUid", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProfileImage", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "imageUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadProfileImage", "Lcom/google/firebase/storage/UploadTask;", "image", "Landroid/net/Uri;", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "profile_debug"})
public final class ImageRepositoryImpl implements com.kursatkumsuz.profile.domain.repository.ImageRepository {
    private final com.google.firebase.firestore.FirebaseFirestore firebaseFirestore = null;
    private final com.google.firebase.storage.FirebaseStorage firebaseStorage = null;
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    
    public ImageRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firebaseFirestore, @org.jetbrains.annotations.NotNull
    com.google.firebase.storage.FirebaseStorage firebaseStorage, @org.jetbrains.annotations.NotNull
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
    public java.lang.Object saveProfileImage(@org.jetbrains.annotations.NotNull
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.google.android.gms.tasks.Task<java.lang.Void>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object uploadProfileImage(@org.jetbrains.annotations.NotNull
    android.net.Uri image, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.google.firebase.storage.UploadTask> continuation) {
        return null;
    }
}