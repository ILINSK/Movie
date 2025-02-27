// Generated by Dagger (https://dagger.dev).
package com.ilinskiy.search.presentation;

import com.ilinskiy.search.domain.usecase.SearchMovieUseCase;
import com.kursatkumsuz.search.domain.usecase.SearchMovieUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<SearchMovieUseCase> searchMovieUseCaseProvider;

  public SearchViewModel_Factory(Provider<SearchMovieUseCase> searchMovieUseCaseProvider) {
    this.searchMovieUseCaseProvider = searchMovieUseCaseProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(searchMovieUseCaseProvider.get());
  }

  public static SearchViewModel_Factory create(
      Provider<SearchMovieUseCase> searchMovieUseCaseProvider) {
    return new SearchViewModel_Factory(searchMovieUseCaseProvider);
  }

  public static SearchViewModel newInstance(SearchMovieUseCase searchMovieUseCase) {
    return new SearchViewModel(searchMovieUseCase);
  }
}
