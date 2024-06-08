package com.kursatkumsuz.onboarding.util;

import androidx.annotation.DrawableRes;
import com.kursatkumsuz.onboarding.R;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u0082\u0001\u0003\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/kursatkumsuz/onboarding/util/OnBoardingPage;", "", "title", "", "description", "image", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getImage", "()I", "getTitle", "First", "Second", "Third", "Lcom/kursatkumsuz/onboarding/util/OnBoardingPage$First;", "Lcom/kursatkumsuz/onboarding/util/OnBoardingPage$Second;", "Lcom/kursatkumsuz/onboarding/util/OnBoardingPage$Third;", "onboarding_debug"})
public abstract class OnBoardingPage {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    private final int image = 0;
    
    private OnBoardingPage(java.lang.String title, java.lang.String description, @androidx.annotation.DrawableRes
    int image) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final int getImage() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/kursatkumsuz/onboarding/util/OnBoardingPage$First;", "Lcom/kursatkumsuz/onboarding/util/OnBoardingPage;", "()V", "onboarding_debug"})
    public static final class First extends com.kursatkumsuz.onboarding.util.OnBoardingPage {
        @org.jetbrains.annotations.NotNull
        public static final com.kursatkumsuz.onboarding.util.OnBoardingPage.First INSTANCE = null;
        
        private First() {
            super(null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/kursatkumsuz/onboarding/util/OnBoardingPage$Second;", "Lcom/kursatkumsuz/onboarding/util/OnBoardingPage;", "()V", "onboarding_debug"})
    public static final class Second extends com.kursatkumsuz.onboarding.util.OnBoardingPage {
        @org.jetbrains.annotations.NotNull
        public static final com.kursatkumsuz.onboarding.util.OnBoardingPage.Second INSTANCE = null;
        
        private Second() {
            super(null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/kursatkumsuz/onboarding/util/OnBoardingPage$Third;", "Lcom/kursatkumsuz/onboarding/util/OnBoardingPage;", "()V", "onboarding_debug"})
    public static final class Third extends com.kursatkumsuz.onboarding.util.OnBoardingPage {
        @org.jetbrains.annotations.NotNull
        public static final com.kursatkumsuz.onboarding.util.OnBoardingPage.Third INSTANCE = null;
        
        private Third() {
            super(null, null, 0);
        }
    }
}