package com.ilinskiy.video.domain.repository

import com.kursatkumsuz.video.model.MovieVideo

interface VideoRepository {
    suspend fun getMovieVideo(movieId : Int) : MovieVideo

}