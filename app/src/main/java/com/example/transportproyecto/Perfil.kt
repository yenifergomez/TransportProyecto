package com.example.transportproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.transportproyecto.databinding.ActivityMainBinding
import com.example.transportproyecto.databinding.ActivityPerfilBinding

class Perfil : AppCompatActivity() {

    private lateinit var binding: ActivityPerfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        binding = ActivityPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickListener()

        binding.editarPerfil.setOnClickListener {
            startActivity(Intent(this@Perfil, Editar_Perfil::class.java))
        }
    }

    private fun clickListener() {
        binding.editarPerfil.setOnClickListener {
        }
    }
}