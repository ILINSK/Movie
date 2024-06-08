package com.kursatkumsuz.watchlist.presentation;

import com.kursatkumsuz.domain.model.WatchListMovie;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J-\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\bH\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001d"}, d2 = {"Lcom/kursatkumsuz/watchlist/presentation/WatchListUIState;", "", "movie", "", "Lcom/kursatkumsuz/domain/model/WatchListMovie;", "loading", "", "error", "", "(Ljava/util/List;ZLjava/lang/String;)V", "getError", "()Ljava/lang/String;", "setError", "(Ljava/lang/String;)V", "getLoading", "()Z", "setLoading", "(Z)V", "getMovie", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "watchlist_debug"})
public final class WatchListUIState {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.kursatkumsuz.domain.model.WatchListMovie> movie = null;
    private boolean loading;
    @org.jetbrains.annotations.NotNull
    private java.lang.String error;
    
    @org.jetbrains.annotations.NotNull
    public final com.kursatkumsuz.watchlist.presentation.WatchListUIState copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.kursatkumsuz.domain.model.WatchListMovie> movie, boolean loading, @org.jetbrains.annotations.NotNull
    java.lang.String error) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public WatchListUIState() {
        super();
    }
    
    public WatchListUIState(@org.jetbrains.annotations.NotNull
    java.util.List<com.kursatkumsuz.domain.model.WatchListMovie> movie, boolean loading, @org.jetbrains.annotations.NotNull
    java.lang.String error) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.kursatkumsuz.domain.model.WatchListMovie> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.kursatkumsuz.domain.model.WatchListMovie> getMovie() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}