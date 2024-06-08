package com.kursatkumsuz.watchlist.presentation;

import androidx.compose.material3.DismissDirection;
import androidx.compose.material3.DismissValue;
import androidx.compose.material.icons.Icons;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.*;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.font.FontWeight;
import com.kursatkumsuz.domain.model.WatchListMovie;
import androidx.compose.material3.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a>\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a>\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a8\u0006\u000b"}, d2 = {"MovieListItem", "", "movie", "Lcom/kursatkumsuz/domain/model/WatchListMovie;", "onNavigateDetail", "Lkotlin/Function1;", "", "WatchList", "", "onDelete", "WatchListContent", "watchlist_debug"})
public final class WatchListContentKt {
    
    @androidx.compose.runtime.Composable
    public static final void WatchListContent(@org.jetbrains.annotations.NotNull
    java.util.List<com.kursatkumsuz.domain.model.WatchListMovie> movie, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDelete, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateDetail) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void WatchList(@org.jetbrains.annotations.NotNull
    java.util.List<com.kursatkumsuz.domain.model.WatchListMovie> movie, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDelete, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateDetail) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void MovieListItem(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.domain.model.WatchListMovie movie, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateDetail) {
    }
}