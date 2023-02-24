package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaObjetoBinding


class pantallaObjeto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaObjetoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.botonRecoger.setOnClickListener(){
            personaje1.mochila.addArticulo(Objetos(), applicationContext)
            val intent= Intent(this, cosasMercader::class.java)
            startActivity(intent)

        }

        binding.botonContinuarObj.setOnClickListener(){
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