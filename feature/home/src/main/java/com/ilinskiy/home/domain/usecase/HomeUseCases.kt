package com.ilinskiy.home.domain.usecase

data class HomeUseCases(
    val getPopularMovieUseCase: GetPopularMovieUseCase,
    val getNowPlayingMovieUseCase: GetNowPlayingMovieUseCase,
    val getTopRatedMovieUseCase: GetTopRatedMovieUseCase
)
