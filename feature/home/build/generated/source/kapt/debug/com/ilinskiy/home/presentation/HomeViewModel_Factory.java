// Generated by Dagger (https://dagger.dev).
package com.ilinskiy.home.presentation;

import com.kursatkumsuz.domain.usecase.UseCases;
import com.kursatkumsuz.home.domain.usecase.HomeUseCases;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<HomeUseCases> homeUseCasesProvider;

  private final Provider<UseCases> useCaseProvider;

  public HomeViewModel_Factory(Provider<HomeUseCases> homeUseCasesProvider,
      Provider<UseCases> useCaseProvider) {
    this.homeUseCasesProvider = homeUseCasesProvider;
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(homeUseCasesProvider.get(), useCaseProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<HomeUseCases> homeUseCasesProvider,
      Provider<UseCases> useCaseProvider) {
    return new HomeViewModel_Factory(homeUseCasesProvider, useCaseProvider);
  }

  public static HomeViewModel newInstance(HomeUseCases homeUseCases, UseCases useCase) {
    return new HomeViewModel(homeUseCases, useCase);
  }
}
