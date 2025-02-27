// Generated by Dagger (https://dagger.dev).
package com.ilinskiy.splash.presentation;

import com.kursatkumsuz.splash.domain.usecase.SplashUseCases;
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
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private final Provider<SplashUseCases> splashUseCasesProvider;

  public SplashViewModel_Factory(Provider<SplashUseCases> splashUseCasesProvider) {
    this.splashUseCasesProvider = splashUseCasesProvider;
  }

  @Override
  public SplashViewModel get() {
    return newInstance(splashUseCasesProvider.get());
  }

  public static SplashViewModel_Factory create(Provider<SplashUseCases> splashUseCasesProvider) {
    return new SplashViewModel_Factory(splashUseCasesProvider);
  }

  public static SplashViewModel newInstance(SplashUseCases splashUseCases) {
    return new SplashViewModel(splashUseCases);
  }
}
