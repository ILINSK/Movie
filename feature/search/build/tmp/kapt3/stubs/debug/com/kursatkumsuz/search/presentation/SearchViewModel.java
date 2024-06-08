package com.kursatkumsuz.search.presentation;

import androidx.lifecycle.ViewModel;
import androidx.paging.PagingData;
import com.kursatkumsuz.search.domain.model.SearchUI;
import com.kursatkumsuz.search.domain.usecase.SearchMovieUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R6\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/kursatkumsuz/search/presentation/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "searchMovieUseCase", "Lcom/kursatkumsuz/search/domain/usecase/SearchMovieUseCase;", "(Lcom/kursatkumsuz/search/domain/usecase/SearchMovieUseCase;)V", "<set-?>", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/PagingData;", "Lcom/kursatkumsuz/search/domain/model/SearchUI;", "searchedMovieList", "getSearchedMovieList", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "onSearchEvent", "", "searchString", "", "searchMovie", "search_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.kursatkumsuz.search.domain.usecase.SearchMovieUseCase searchMovieUseCase = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.kursatkumsuz.search.domain.model.SearchUI>> searchedMovieList;
    
    @javax.inject.Inject
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.search.domain.usecase.SearchMovieUseCase searchMovieUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.kursatkumsuz.search.domain.model.SearchUI>> getSearchedMovieList() {
        return null;
    }
    
    private final void searchMovie(java.lang.String searchString) {
    }
    
    public final void onSearchEvent(@org.jetbrains.annotations.NotNull
    java.lang.String searchString) {
    }
}