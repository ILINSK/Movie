package com.kursatkumsuz.home.presentation.component;

import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.paging.compose.LazyPagingItems;
import com.google.accompanist.pager.ExperimentalPagerApi;
import com.kursatkumsuz.home.domain.model.ResultHomeUI;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a4\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a8\u0006\r"}, d2 = {"NowPlayingHorizontalPager", "", "nowPlayingPagingItem", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/kursatkumsuz/home/domain/model/ResultHomeUI;", "onNavigateDetailScreen", "Lkotlin/Function1;", "", "NowPlayingItem", "movie", "pageOffset", "", "scale", "home_debug"})
public final class NowPlayingHorizontalPagerKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {com.google.accompanist.pager.ExperimentalPagerApi.class})
    public static final void NowPlayingHorizontalPager(@org.jetbrains.annotations.NotNull
    androidx.paging.compose.LazyPagingItems<com.kursatkumsuz.home.domain.model.ResultHomeUI> nowPlayingPagingItem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateDetailScreen) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void NowPlayingItem(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.home.domain.model.ResultHomeUI movie, float pageOffset, float scale, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateDetailScreen) {
    }
}