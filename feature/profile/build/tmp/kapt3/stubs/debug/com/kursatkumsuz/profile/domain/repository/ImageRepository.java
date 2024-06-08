package com.kursatkumsuz.profile.domain.repository;

import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.UploadTask;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/kursatkumsuz/profile/domain/repository/ImageRepository;", "", "getUserUid", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProfileImage", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "imageUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadProfileImage", "Lcom/google/firebase/storage/UploadTask;", "image", "Landroid/net/Uri;", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "profile_debug"})
public abstract interface ImageRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveProfileImage(@org.jetbrains.annotations.NotNull
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.google.android.gms.tasks.Task<java.lang.Void>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object uploadProfileImage(@org.jetbrains.annotations.NotNull
    android.net.Uri image, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.google.firebase.storage.UploadTask> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUserUid(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
}