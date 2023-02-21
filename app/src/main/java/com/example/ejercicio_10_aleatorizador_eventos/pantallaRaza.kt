package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaRazaBinding

class pantallaRaza : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaRazaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var imagenClase= intent.getStringExtra("ImagenClase")
        var imagenRaza=""


        Toast.makeText(this, personaje1.clase,Toast.LENGTH_SHORT).show()

        binding.botonElfo.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.elfo)
            personaje1.raza.equals("elfo")
        }

        binding.botonGoblin.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.goblin)
            personaje1.raza.equals("goblin")

        }
        binding.botonEnano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.enano)
            personaje1.raza.equals("enano")

        }
        binding.botonHumano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.humamo)
            personaje1.raza.equals("humano")

        }
        binding.botonAceptar.setOnClickListener {
            val intent= Intent(this, pantallaResumen::class.java)

            startActivity(intent)
        }
    }
}