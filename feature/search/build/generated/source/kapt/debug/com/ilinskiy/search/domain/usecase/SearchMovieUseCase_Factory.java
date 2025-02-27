// Generated by Dagger (https://dagger.dev).
package com.ilinskiy.search.domain.usecase;

import com.ilinskiy.search.domain.repository.SearchRepository;
import com.kursatkumsuz.search.domain.repository.SearchRepository;
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
public final class SearchMovieUseCase_Factory implements Factory<SearchMovieUseCase> {
  private final Provider<SearchRepository> searchRepositoryProvider;

  public SearchMovieUseCase_Factory(Provider<SearchRepository> searchRepositoryProvider) {
    this.searchRepositoryProvider = searchRepositoryProvider;
  }

  @Override
  public SearchMovieUseCase get() {
    return newInstance(searchRepositoryProvider.get());
  }

  public static SearchMovieUseCase_Factory create(
      Provider<SearchRepository> searchRepositoryProvider) {
    return new SearchMovieUseCase_Factory(searchRepositoryProvider);
  }

  public static SearchMovieUseCase newInstance(SearchRepository searchRepository) {
    return new SearchMovieUseCase(searchRepository);
  }
}
