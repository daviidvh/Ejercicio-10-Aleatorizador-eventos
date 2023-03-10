package com.example.ejercicio_10_aleatorizador_eventos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityCosasMercaderBinding

class cosasMercader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCosasMercaderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.infoEspacio.text = personaje1.mochila.getPesoMochila().toString()

        binding.infoObjetos.text= personaje1.mochila.getContenido().count().toString()
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