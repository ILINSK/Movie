package com.kursatkumsuz.profile.presentation;

import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.*;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import com.kursatkumsuz.domain.model.User;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a.\u0010\r\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u00a8\u0006\u000e"}, d2 = {"ProfileContent", "", "user", "Lcom/kursatkumsuz/domain/model/User;", "profileImage", "", "isPhotoUploading", "", "onSignOutClick", "Lkotlin/Function0;", "onSaveProfileImage", "Lkotlin/Function1;", "Landroid/net/Uri;", "ProfileImage", "profile_debug"})
public final class ProfileContentKt {
    
    @androidx.compose.runtime.Composable
    public static final void ProfileContent(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.domain.model.User user, @org.jetbrains.annotations.NotNull
    java.lang.String profileImage, boolean isPhotoUploading, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSignOutClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> onSaveProfileImage) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ProfileImage(boolean isPhotoUploading, @org.jetbrains.annotations.NotNull
    java.lang.String profileImage, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> onSaveProfileImage) {
    }
}