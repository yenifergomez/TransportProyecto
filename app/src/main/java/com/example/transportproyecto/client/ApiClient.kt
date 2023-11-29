package com.example.transportproyecto.client

import com.example.transportproyecto.service.ApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

<<<<<<< HEAD

    const val baseUrl = "http://10.185.217.12:8000" //"http://192.168.10.79:8000" // Reemplaza esto con tu baseUrl

=======
    const val baseUrl = "http://192.168.80.45:8000" //"http://192.168.10.79:8000" // Reemplaza esto con tu baseUrl
>>>>>>> 389fd6e46c0f6c78d1499ae9b10773b12b412eac

    private fun getRetrofit(): Retrofit {

        val logger = HttpLoggingInterceptor()
        logger.setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient().newBuilder()
            .addInterceptor(logger)
            .build()

        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .baseUrl(baseUrl)
            .build()
    }

    fun getApiService(): ApiService{
        return getRetrofit().create(ApiService::class.java)
    }

}