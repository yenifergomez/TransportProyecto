package com.example.transportproyecto.service

import com.example.transportproyecto.model.request.LoginRequest
import com.example.transportproyecto.model.response.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("/api/login")
    fun loginUser(@Body loginRequest: LoginRequest): Call<LoginResponse>

   /* @POST("/api/register")
    fun registerUser(@Body registerRequest: RegisterRequest): Call<RegisterResponse>
   */


}