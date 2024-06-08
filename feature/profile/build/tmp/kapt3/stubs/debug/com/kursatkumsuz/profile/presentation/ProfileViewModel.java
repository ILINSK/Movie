package com.kursatkumsuz.profile.presentation;

import android.net.Uri;
import androidx.lifecycle.ViewModel;
import com.kursatkumsuz.domain.model.User;
import com.kursatkumsuz.domain.usecase.UseCases;
import com.kursatkumsuz.profile.domain.usecase.ProfileUseCases;
import com.kursatkumsuz.util.Response;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J2\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u001bH\u0002J(\u0010\u001c\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u001bJ0\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u001bR.\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00100\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/kursatkumsuz/profile/presentation/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "profileUseCases", "Lcom/kursatkumsuz/profile/domain/usecase/ProfileUseCases;", "useCases", "Lcom/kursatkumsuz/domain/usecase/UseCases;", "(Lcom/kursatkumsuz/profile/domain/usecase/ProfileUseCases;Lcom/kursatkumsuz/domain/usecase/UseCases;)V", "<set-?>", "Landroidx/compose/runtime/MutableState;", "", "imageState", "getImageState", "()Landroidx/compose/runtime/MutableState;", "Lcom/kursatkumsuz/profile/presentation/ProfileUIState;", "state", "getState", "", "uploadState", "getUploadState", "loadProfileImage", "", "loadUserInformation", "saveProfileImage", "imageUrl", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "signOut", "uploadProfileImage", "image", "Landroid/net/Uri;", "profile_debug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    private final com.kursatkumsuz.profile.domain.usecase.ProfileUseCases profileUseCases = null;
    private final com.kursatkumsuz.domain.usecase.UseCases useCases = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<com.kursatkumsuz.profile.presentation.ProfileUIState> state;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.String> imageState;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.Boolean> uploadState;
    
    @javax.inject.Inject
    public ProfileViewModel(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.profile.domain.usecase.ProfileUseCases profileUseCases, @org.jetbrains.annotations.NotNull
    com.kursatkumsuz.domain.usecase.UseCases useCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.kursatkumsuz.profile.presentation.ProfileUIState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getImageState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getUploadState() {
        return null;
    }
    
    private final void loadUserInformation() {
    }
    
    private final void saveProfileImage(java.lang.String imageUrl, kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
    }
    
    private final void loadProfileImage() {
    }
    
    public final void uploadProfileImage(@org.jetbrains.annotations.NotNull
    android.net.Uri image, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
    }
    
    public final void signOut(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
    }
}