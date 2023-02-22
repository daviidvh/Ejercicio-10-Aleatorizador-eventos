package com.example.ejercicio_10_aleatorizador_eventos

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaEnemigoBinding
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaObjetoBinding

class pantallaEnemigo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaEnemigoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonLuchar.setOnClickListener(){
            val intent= Intent(this, pelea::class.java)
            startActivity(intent)
        }

        binding.botonHuir.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}