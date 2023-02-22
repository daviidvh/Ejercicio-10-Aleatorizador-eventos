package com.example.ejercicio_10_aleatorizador_eventos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaResumenBinding
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPeleaBinding

class pelea : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPeleaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonAtaque.setOnClickListener(){
            ataque()
        }

        binding.botonhuirP.setOnClickListener(){
            huir()
        }

        binding.progressBarUsuario.progress=personaje1.getVida()
        var enemigo:enemigos
        var numRandomEnemigo:Int=(1 until 2).random()
        if (numRandomEnemigo==1){
            enemigo= enemigoNormal
            binding.progressBarEnemigo.progress=enemigo.vida
        }else{
            enemigo= enemigoJefe
            binding.progressBarEnemigo.progress=enemigo.vida
        }
    }
    fun ataque(){
        var ataqueRandom:Int=(1 until 6).random()

        if (ataqueRandom.equals(4 until 6)){

        }else{
            Toast.makeText(this, "Ataque fallido", Toast.LENGTH_SHORT).show()
        }
    }


    fun huir(){
        var ataqueRandom:Int=(1 until 6).random()

        if (ataqueRandom == 5 or 6){
            Toast.makeText(this, "Ole ole que has huido", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "Ataque fallido", Toast.LENGTH_SHORT).show()
        }
    }
}

