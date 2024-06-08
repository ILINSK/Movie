package com.kursatkumsuz.home.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.paging.compose.LazyPagingItems;
import com.kursatkumsuz.domain.model.User;
import com.kursatkumsuz.home.domain.model.ResultHomeUI;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\fH\u0007\u001a\u0012\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0003H\u0007\u00a8\u0006\u0012"}, d2 = {"HomeContent", "", "profileImage", "", "user", "Lcom/kursatkumsuz/domain/model/User;", "topRatedPagingItem", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/kursatkumsuz/home/domain/model/ResultHomeUI;", "popularPagingItem", "nowPlayingPagingItem", "onNavigateDetailScreen", "Lkotlin/Function1;", "PageLoader", "modifier", "Landroidx/compose/ui/Modifier;", "ProfileImage", "image", "home_debug"})
public final class HomeContentKt {
    
    @androidx.compose.runtime.Composable
    public static final void HomeContent(@org.jetbrains.annotations.NotNull
    java.lang.String profileImage, @org.jetbrains.annotations.Nullable
    com.kursatkumsuz.domain.model.User user, @org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.kursatkumsuz.home.domain.model.ResultHomeUI> topRatedPagingItem, @org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.kursatkumsuz.home.domain.model.ResultHomeUI> popularPagingItem, @org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.kursatkumsuz.home.domain.model.ResultHomeUI> nowPlayingPagingItem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateDetailScreen) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void PageLoader(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ProfileImage(@org.jetbrains.annotations.NotNull
    java.lang.String image) {
    }
}