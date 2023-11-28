package com.example.transportproyecto

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import com.example.transportproyecto.client.ApiClient
import com.example.transportproyecto.service.ApiService
import org.w3c.dom.Comment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Foro : AppCompatActivity() {

    private val apiService = ApiClient.getApiService()

      override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // Ejemplo de cómo usar Retrofit para obtener comentarios
            val call = apiService.getComments()

            call.enqueue(object : Callback<List<Comment>> {
                override fun onResponse(call: Call<List<Comment>>, response: Response<List<Comment>>) {
                    if (response.isSuccessful) {
                        val comments = response.body()
                        // Hacer algo con la lista de comentarios
                    } else {
                        // Manejar error de respuesta
                    }
                }

                override fun onFailure(call: Call<List<Comment>>, t: Throwable) {
                    // Manejar error de red
                }
            })
        }
    }
