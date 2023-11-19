package com.example.transportproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.Timer
import java.util.TimerTask

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tiempoIni: TimerTask = object : TimerTask() {
            override fun run() {
                val intent = Intent(this@MainActivity, Login::class.java)
                startActivity(intent)
                finish()
            }
        }
        val tiempo = Timer()
        tiempo.schedule(tiempoIni, 4000)
    }
}