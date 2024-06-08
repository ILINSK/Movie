package com.ilinskiy.video.presentation

import com.kursatkumsuz.video.model.MovieVideo

data class VideoUIState(
    var movie: MovieVideo? = null,
    var isLoading: Boolean = false,
    var error: String = ""
)