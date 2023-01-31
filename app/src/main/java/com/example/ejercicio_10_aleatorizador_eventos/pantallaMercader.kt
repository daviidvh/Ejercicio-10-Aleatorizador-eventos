package com.example.ejercicio_10_aleatorizador_eventos

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaMercaderBinding
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaObjetoBinding

class pantallaMercader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaMercaderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonComerciar.setOnClickListener(){
            val intent= Intent(this, pantallaBlanco::class.java)
            startActivity(intent)
        }

        binding.botonContinuarMer.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}