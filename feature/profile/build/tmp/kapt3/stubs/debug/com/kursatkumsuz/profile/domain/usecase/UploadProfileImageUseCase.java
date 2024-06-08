package com.kursatkumsuz.profile.domain.usecase;

import android.net.Uri;
import com.kursatkumsuz.profile.domain.repository.ImageRepository;
import com.kursatkumsuz.util.Response;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012 \n*\b\u0018\u00010\bR\u00020\t0\bR\u00020\t0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/kursatkumsuz/profile/domain/usecase/UploadProfileImageUseCase;", "", "imageRepository", "Lcom/kursatkumsuz/profile/domain/repository/ImageRepository;", "(Lcom/kursatkumsuz/profile/domain/repository/ImageRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kursatkumsuz/util/Response;", "Lcom/google/firebase/storage/UploadTask$TaskSnapshot;", "Lcom/google/firebase/storage/UploadTask;", "kotlin.jvm.PlatformType", "image", "Landroid/net/Uri;", "profile_debug"})
public final class UploadProfileImageUseCase {
    private final com.kursatkumsuz.profile.domain.repository.ImageRepository imageRepository = null;
    
    public UploadProfileImageUseCase(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.profile.domain.repository.ImageRepository imageRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.kursatkumsuz.util.Response<com.google.firebase.storage.UploadTask.TaskSnapshot>> invoke(@org.jetbrains.annotations.NotNull
    android.net.Uri image) {
        return null;
    }
}