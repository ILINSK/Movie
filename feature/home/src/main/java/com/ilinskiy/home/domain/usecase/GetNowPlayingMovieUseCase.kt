package com.ilinskiy.home.domain.usecase

import androidx.paging.PagingData
import com.kursatkumsuz.home.data.model.Result
import com.kursatkumsuz.home.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow

class GetNowPlayingMovieUseCase(
    private val movieRepository: MovieRepository
) {
     operator fun invoke(): Flow<PagingData<Result>> {
        return movieRepository.getNowPlayingMovies()
    }
}