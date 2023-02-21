package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaClasesBinding

class pantallaClases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaClasesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonMago.setOnClickListener {
            binding.foto.setImageResource(R.drawable.mago)
            personaje1.clase.equals("mago")
        }
        binding.botonLadron.setOnClickListener {
            binding.foto.setImageResource(R.drawable.ladron)
            personaje1.clase.equals("ladron")
        }
        binding.botonGuerrero.setOnClickListener {
            binding.foto.setImageResource(R.drawable.guerrero)
            personaje1.clase.equals("guerrero")
        }
        binding.botonBerserker.setOnClickListener {
            binding.foto.setImageResource(R.drawable.berserker)
            personaje1.clase.equals("berserker")

        }

        binding.botonAceptar.setOnClickListener {
            val cambio= Intent(this, pantallaRaza::class.java)
            startActivity(cambio)
        }

    }
}
