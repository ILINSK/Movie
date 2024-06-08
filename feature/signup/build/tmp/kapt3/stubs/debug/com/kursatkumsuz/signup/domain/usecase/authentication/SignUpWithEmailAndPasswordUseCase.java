package com.kursatkumsuz.signup.domain.usecase.authentication;

import com.kursatkumsuz.signup.domain.repository.AuthenticationRepository;
import com.kursatkumsuz.util.Response;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/kursatkumsuz/signup/domain/usecase/authentication/SignUpWithEmailAndPasswordUseCase;", "", "authRepository", "Lcom/kursatkumsuz/signup/domain/repository/AuthenticationRepository;", "(Lcom/kursatkumsuz/signup/domain/repository/AuthenticationRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kursatkumsuz/util/Response;", "Lcom/google/firebase/auth/AuthResult;", "email", "", "password", "signup_debug"})
public final class SignUpWithEmailAndPasswordUseCase {
    private final com.kursatkumsuz.signup.domain.repository.AuthenticationRepository authRepository = null;
    
    public SignUpWithEmailAndPasswordUseCase(@org.jetbrains.annotations.NotNull
    com.kursatkumsuz.signup.domain.repository.AuthenticationRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.kursatkumsuz.util.Response<com.google.firebase.auth.AuthResult>> invoke(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
}