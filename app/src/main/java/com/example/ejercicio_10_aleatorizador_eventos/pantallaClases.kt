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
            personaje1.setClase("mago")
        }
        binding.botonLadron.setOnClickListener {
            binding.foto.setImageResource(R.drawable.ladron)
            personaje1.setClase("ladron")
        }
        binding.botonGuerrero.setOnClickListener {
            binding.foto.setImageResource(R.drawable.guerrero)
            personaje1.setClase("guerrero")
        }
        binding.botonBerserker.setOnClickListener {
            binding.foto.setImageResource(R.drawable.berserker)
            personaje1.setClase("berserker")

        }
        binding.botonMercader.setOnClickListener {
            binding.foto.setImageResource(R.drawable.mercader)
            personaje1.setClase("mercader")

        }
        binding.botonAceptar.setOnClickListener {
            val cambio= Intent(this, pantallaRaza::class.java)
            startActivity(cambio)
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
