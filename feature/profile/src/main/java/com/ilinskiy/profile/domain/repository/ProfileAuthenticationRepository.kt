package com.ilinskiy.profile.domain.repository

interface ProfileAuthenticationRepository {
    suspend fun signOut()
}