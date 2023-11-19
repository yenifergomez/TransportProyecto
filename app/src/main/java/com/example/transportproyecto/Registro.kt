package com.example.transportproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        ////se conecta a la vista de el login

        val irLogin = findViewById<TextView>(R.id.login_transport)
        irLogin.setOnClickListener{
            LoginIr()
        }
    }
    private fun LoginIr (){
        val i = Intent(this,Login::class.java)
        startActivity(i)



    }
}