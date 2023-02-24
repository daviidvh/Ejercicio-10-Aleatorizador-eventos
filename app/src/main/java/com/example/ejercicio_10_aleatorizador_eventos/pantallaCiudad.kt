package com.example.ejercicio_10_aleatorizador_eventos

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaCiudadBinding
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaObjetoBinding

class pantallaCiudad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaCiudadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonEntrar.setOnClickListener(){
            val intent= Intent(this, pantallaBlanco::class.java)
            startActivity(intent)
        }

        binding.botonContinuar.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.btnpausa.setOnClickListener(){
            /**Atraves del metodo pause pausamos la musica**/
            mediaPlayer.pause()
        }

        binding.btnplay.setOnClickListener(){
            /**Con el metodo start volvemos a empezar la musica**/
            mediaPlayer.start()
        }
    }

}