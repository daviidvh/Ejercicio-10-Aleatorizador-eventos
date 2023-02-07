package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaObjetoBinding


class pantallaObjeto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaObjetoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var personaje1=Personaje("pepe")
        personaje1.mochila.addArticulo()
        binding.botonRecoger.setOnClickListener(){
            val intent= Intent(this, pantallaBlanco::class.java)
            startActivity(intent)
        }

        binding.botonContinuarObj.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}