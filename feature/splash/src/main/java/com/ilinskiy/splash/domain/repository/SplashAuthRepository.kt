package com.ilinskiy.splash.domain.repository

interface SplashAuthRepository {
    suspend fun isSignedIn(): Boolean
}