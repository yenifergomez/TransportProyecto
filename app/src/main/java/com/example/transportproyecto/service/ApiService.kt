package com.example.transportproyecto.service

import com.example.transportproyecto.model.request.LoginRequest
import com.example.transportproyecto.model.request.RegisterRequest
import com.example.transportproyecto.model.response.LoginResponse
import com.example.transportproyecto.model.response.RegisterResponse
import com.example.transportproyecto.model.response.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ApiService {

    @POST("/api/login")
    fun loginUser(@Body loginRequest: LoginRequest): Call<LoginResponse>

    @POST("/api/register")
    fun registerUser(@Body registerRequest: RegisterRequest): Call<RegisterResponse>

    @GET("api/delete/")
    fun deleteUser(): Call<User>

    @GET("api/users/{userId}")
    fun getUserProfile(@Path("userId") userId: String): Call<User>

        @PUT("/users/{userId}")
        fun updateUserProfile(@Path("userId") userId: String, @Body user: User): Call<User>

}

