package com.kursatkumsuz.profile.presentation;

import com.kursatkumsuz.domain.model.User;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00c6\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\bH\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/kursatkumsuz/profile/presentation/ProfileUIState;", "", "user", "Lcom/kursatkumsuz/domain/model/User;", "isImageUploading", "", "isLoading", "error", "", "(Lcom/kursatkumsuz/domain/model/User;ZZLjava/lang/String;)V", "getError", "()Ljava/lang/String;", "setError", "(Ljava/lang/String;)V", "()Z", "setImageUploading", "(Z)V", "setLoading", "getUser", "()Lcom/kursatkumsuz/domain/model/User;", "setUser", "(Lcom/kursatkumsuz/domain/model/User;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "profile_debug"})
public final class ProfileUIState {
    @org.jetbrains.annotations.NotNull
    private com.kursatkumsuz.domain.model.User user;
    private boolean isImageUploading;
    private boolean isLoading;
    @org.jetbrains.annotations.NotNull
    private java.lang.String error;
    
    @org.jetbrains.annotations.NotNull
    public final com.kursatkumsuz.profile.presentation.ProfileUIState copy(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.domain.model.User user, boolean isImageUploading, boolean isLoading, @org.jetbrains.annotations.NotNull
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
    
    public ProfileUIState() {
        super();
    }
    
    public ProfileUIState(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.domain.model.User user, boolean isImageUploading, boolean isLoading, @org.jetbrains.annotations.NotNull
    java.lang.String error) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.kursatkumsuz.domain.model.User component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.kursatkumsuz.domain.model.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.domain.model.User p0) {
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean isImageUploading() {
        return false;
    }
    
    public final void setImageUploading(boolean p0) {
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
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