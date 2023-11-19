package com.example.transportproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        ////se conecta a la vista de el login

        val irLogin = findViewById<TextView>(R.id.RegistraUsuario)
        irLogin.setOnClickListener{
            LoginIr()
        }
    }
    private fun LoginIr (){
        val i = Intent(this,Registro::class.java)
        startActivity(i)

        ////se conecta a la vista de olvido su contraseña

        val RegresarInicioDeSesion = findViewById<TextView>(R.id.OlvidoSuContraseña)
        RegresarInicioDeSesion .setOnClickListener{
            IrInicioDeSesion()
        }
    }
    private fun IrInicioDeSesion (){
        val i = Intent(this,RecuperarC::class.java)
        startActivity(i)



        val btn: Button = findViewById(R.id.Button)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }







    }
}