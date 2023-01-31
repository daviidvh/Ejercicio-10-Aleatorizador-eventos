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


        binding.imgDado.setOnClickListener(){
            var numAleatorio=(1..4).random()

            if(numAleatorio==1){
                val intent= Intent(this, pantallaObjeto::class.java)
                startActivity(intent)
            }else if (numAleatorio==2){
                val intent2= Intent(this, pantallaCiudad::class.java)
                startActivity(intent2)
            }else if (numAleatorio==3){
                val intent3= Intent(this, pantallaMercader::class.java)
                startActivity(intent3)
            }else if (numAleatorio==4){
                val intent4= Intent(this, pantallaEnemigo::class.java)
                startActivity(intent4)

            }
        }

    }
}