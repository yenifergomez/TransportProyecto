package com.example.transportproyecto

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import org.w3c.dom.Comment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Foro : AppCompatActivity() {
// MainActivity.kt

    /*    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // Ejemplo de cómo usar Retrofit para obtener comentarios
            val call = RetrofitInstance.apiService.getComments()

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
        }*/
    }
