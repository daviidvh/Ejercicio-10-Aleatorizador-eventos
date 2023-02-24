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




        binding.botonElfo.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.elfo)
            personaje1.setRaza("elfo")
        }

        binding.botonGoblin.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.goblin)
            personaje1.setRaza("goblin")

        }
        binding.botonEnano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.enano)
            personaje1.setRaza("enano")

        }
        binding.botonHumano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.humamo)
            personaje1.setRaza("humano")

        }
        binding.botonAceptar.setOnClickListener {
            val intent= Intent(this, pantallaResumen::class.java)
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