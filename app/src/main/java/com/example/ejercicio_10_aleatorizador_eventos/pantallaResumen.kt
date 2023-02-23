package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.persistableBundleOf
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaResumenBinding

class pantallaResumen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaResumenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        if(personaje1.getClase() == "mago"){
            binding.imagenClase.setImageResource(R.drawable.mago)
        }else if (personaje1.getClase() == "ladron"){
            binding.imagenClase.setImageResource(R.drawable.ladron)
        }else if (personaje1.getClase() == "guerrero") {
            binding.imagenClase.setImageResource(R.drawable.guerrero)
        }else if (personaje1.getClase()=="berserker"){
            binding.imagenClase.setImageResource(R.drawable.berserker)
    }else if (personaje1.getClase() == "mercader"){
            binding.imagenClase.setImageResource(R.drawable.mercader)
        }

        if (personaje1.getRaza() == "elfo"){
            binding.imagenRaza.setImageResource(R.drawable.elfo)
        }else if (personaje1.getRaza()=="goblin"){
            binding.imagenRaza.setImageResource(R.drawable.goblin)
        }else  if (personaje1.getRaza() == "enano") {
            binding.imagenRaza.setImageResource(R.drawable.enano)
        }else  if (personaje1.getRaza()=="humano") {
            binding.imagenRaza.setImageResource(R.drawable.humamo)
        }

        var randomFuerza=(10..15).random()
        var randomDefensa=(1..5).random()
        var tamMochila=100
        var vida=200
        var monedero=0

        personaje1.setNombre(binding.editText.text.toString())

        binding.nombrePersonaje.text = personaje1.getNombre()
        binding.fuerza.setText(randomFuerza.toString())
        binding.defensa.setText(randomDefensa.toString())
        binding.mochila.setText(tamMochila.toString())
        binding.vida.setText(vida.toString())
        binding.monedero.setText(monedero.toString())
        personaje1.fuerza=randomFuerza
        personaje1.defensa=randomDefensa

        binding.botonComenzar.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.botonInicio.setOnClickListener{
            val intent2= Intent(this, pantallaClases::class.java)
            startActivity(intent2)
        }
    }
}