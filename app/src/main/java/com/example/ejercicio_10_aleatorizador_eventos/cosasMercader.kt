package com.example.ejercicio_10_aleatorizador_eventos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityCosasMercaderBinding

class cosasMercader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCosasMercaderBinding.inflate(layoutInflater)
        setContentView(binding.root)
       var personaje1 = intent.getSerializableExtra("personaje") as Personaje
        binding.infoEspacio.text.equals(personaje1.mochila.getPesoMochila()).toString()

        binding.infoObjetos.text.equals(personaje1.mochila.getContenido().count())

    }
}