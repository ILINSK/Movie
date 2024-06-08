package com.kursatkumsuz.signup.domain.usecase.user;

import com.kursatkumsuz.domain.model.User;
import com.kursatkumsuz.signup.domain.repository.AuthenticationRepository;
import com.kursatkumsuz.signup.domain.repository.FirebaseStorageRepository;
import com.kursatkumsuz.util.Response;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e0\r0\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/kursatkumsuz/signup/domain/usecase/user/SaveUserUseCase;", "", "firebaseStorageRepository", "Lcom/kursatkumsuz/signup/domain/repository/FirebaseStorageRepository;", "authenticationRepository", "Lcom/kursatkumsuz/signup/domain/repository/AuthenticationRepository;", "(Lcom/kursatkumsuz/signup/domain/repository/FirebaseStorageRepository;Lcom/kursatkumsuz/signup/domain/repository/AuthenticationRepository;)V", "getAuthenticationRepository", "()Lcom/kursatkumsuz/signup/domain/repository/AuthenticationRepository;", "getFirebaseStorageRepository", "()Lcom/kursatkumsuz/signup/domain/repository/FirebaseStorageRepository;", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kursatkumsuz/util/Response;", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/firestore/DocumentReference;", "user", "Lcom/kursatkumsuz/domain/model/User;", "signup_debug"})
public final class SaveUserUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.kursatkumsuz.signup.domain.repository.FirebaseStorageRepository firebaseStorageRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.kursatkumsuz.signup.domain.repository.AuthenticationRepository authenticationRepository = null;
    
    public SaveUserUseCase(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.signup.domain.repository.FirebaseStorageRepository firebaseStorageRepository, @org.jetbrains.annotations.NotNull
    com.kursatkumsuz.signup.domain.repository.AuthenticationRepository authenticationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.kursatkumsuz.signup.domain.repository.FirebaseStorageRepository getFirebaseStorageRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.kursatkumsuz.signup.domain.repository.AuthenticationRepository getAuthenticationRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.kursatkumsuz.util.Response<com.google.android.gms.tasks.Task<com.google.firebase.firestore.DocumentReference>>> invoke(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.domain.model.User user) {
        return null;
    }
}