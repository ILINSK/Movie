package com.ilinskiy.profile.domain.usecase

data class ProfileUseCases(
    val saveUserProfileImageUseCase: SaveUserProfileImageUseCase,
    val uploadProfileImageUseCase: UploadProfileImageUseCase,
    val signOutUseCase: SignOutUseCase
)
