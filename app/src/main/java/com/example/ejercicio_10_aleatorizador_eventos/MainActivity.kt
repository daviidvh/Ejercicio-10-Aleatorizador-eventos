package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnpausa.setOnClickListener(){
            mediaPlayer.pause()
        }

        binding.btnplay.setOnClickListener(){
            mediaPlayer.start()
        }


        binding.imgDado.setOnClickListener(){
            var numAleatorio=(1..4).random()

            if(numAleatorio==1){
                val intent= Intent(this, pantallaObjeto::class.java)
                startActivity(intent)
            }else if (numAleatorio==2){
                val intent= Intent(this, pantallaCiudad::class.java)
                startActivity(intent)
            }else if (numAleatorio==3){
                val intent= Intent(this, pantallaMercader::class.java)
                startActivity(intent)
            }else if (numAleatorio==4){
                val intent= Intent(this, pantallaEnemigo::class.java)
                startActivity(intent)

            }
        }

    }
}