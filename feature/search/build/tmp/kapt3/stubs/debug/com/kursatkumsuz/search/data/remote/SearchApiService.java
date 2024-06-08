package com.kursatkumsuz.search.data.remote;

import com.kursatkumsuz.search.data.model.Search;
import com.kursatkumsuz.util.Constants;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/kursatkumsuz/search/data/remote/SearchApiService;", "", "searchMovie", "Lcom/kursatkumsuz/search/data/model/Search;", "apiKey", "", "page", "", "searchString", "adult", "", "(Ljava/lang/String;ILjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search_debug"})
public abstract interface SearchApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "search/movie")
    public abstract java.lang.Object searchMovie(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "query")
    java.lang.String searchString, @retrofit2.http.Query(value = "include_adult")
    boolean adult, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.kursatkumsuz.search.data.model.Search> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}