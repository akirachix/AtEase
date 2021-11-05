package com.example.atease.Api

import com.example.atease.models.*
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInterface {
    @POST("/user/signup")
    suspend fun signupUser(@Body signupRequest: SignupRequest): Response<SignupResponse>

    @POST ("user/login")
    suspend fun loginUser(@Body loginRequest: LoginRequest): Response<LoginResponse>

    @GET("stress")
    suspend fun fetchStress(@Header ("Authorization") token: String): Response<StressResponse>

}