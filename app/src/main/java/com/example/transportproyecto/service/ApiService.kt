package com.example.transportproyecto.service

import com.example.transportproyecto.model.request.LoginRequest
import com.example.transportproyecto.model.request.RegisterRequest
import com.example.transportproyecto.model.response.LoginResponse
import com.example.transportproyecto.model.response.RegisterResponse
import org.w3c.dom.Comment
import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("/api/login")
    fun loginUser(@Body loginRequest: LoginRequest): Call<LoginResponse>

    @POST("/api/register")
    fun registerUser(@Body registerRequest: RegisterRequest): Call<RegisterResponse>



    // ApiService.kt foro
    interface ApiService {
        @GET("comments")
        fun getComments(): Call<List<Comment>>

        @POST("comments")
        fun createComment(@Body comment: Comment): Call<Comment>

        @GET("comments/{commentId}")
        fun getComment(@Path("commentId") commentId: String): Call<Comment>

        @PUT("comments/{commentId}")
        fun updateComment(@Path("commentId") commentId: String, @Body comment: Comment): Call<Comment>

        @DELETE("comments/{commentId}")
        fun deleteComment(@Path("commentId") commentId: String): Call<Void>
    }

}

