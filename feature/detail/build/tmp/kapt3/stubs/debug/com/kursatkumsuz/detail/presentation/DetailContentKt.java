package com.kursatkumsuz.detail.presentation;

import androidx.compose.material.icons.Icons;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.font.FontWeight;
import com.kursatkumsuz.detail.data.model.detail.Genre;
import com.kursatkumsuz.detail.domain.model.CastUI;
import com.kursatkumsuz.detail.domain.model.MovieDetailUI;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001aR\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a\u0016\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u0007\u00a8\u0006\u0011"}, d2 = {"CastList", "", "cast", "", "Lcom/kursatkumsuz/detail/domain/model/CastUI;", "DetailContent", "movie", "Lcom/kursatkumsuz/detail/domain/model/MovieDetailUI;", "isLoading", "", "onBackClick", "Lkotlin/Function0;", "onSaveWatchlistClick", "onWatchClick", "GenreList", "genres", "Lcom/kursatkumsuz/detail/data/model/detail/Genre;", "detail_debug"})
public final class DetailContentKt {
    
    @androidx.compose.runtime.Composable
    public static final void DetailContent(@org.jetbrains.annotations.Nullable
    com.kursatkumsuz.detail.domain.model.MovieDetailUI movie, boolean isLoading, @org.jetbrains.annotations.NotNull
    java.util.List<com.kursatkumsuz.detail.domain.model.CastUI> cast, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSaveWatchlistClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onWatchClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void GenreList(@org.jetbrains.annotations.NotNull
    java.util.List<com.kursatkumsuz.detail.data.model.detail.Genre> genres) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CastList(@org.jetbrains.annotations.NotNull
    java.util.List<com.kursatkumsuz.detail.domain.model.CastUI> cast) {
    }
}