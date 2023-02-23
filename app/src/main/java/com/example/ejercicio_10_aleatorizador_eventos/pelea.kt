package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Intent
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
        /**Cositas de la barra**/
        binding.progressBarUsuario.max = personaje1.vida
        binding.progressBarUsuario.progress= personaje1.vida
        var enemigo: enemigos
        var numRandomEnemigo: Int = (1..2).random()
        if (numRandomEnemigo == 1) {
            enemigo = enemigoNormal
            binding.progressBarEnemigo.max = enemigo.vida
            binding.progressBarEnemigo.progress=enemigo.vida

        } else {
            enemigo = enemigoJefe
            binding.progressBarEnemigo.max = enemigo.vida
            binding.progressBarEnemigo.progress=enemigo.vida

        }

        /**Boton atque**/
        binding.botonAtaque.setOnClickListener() {
            var ataqueRandom: Int = (1..6).random()

            if (ataqueRandom in 4..6) {
                Toast.makeText(this, "Ataque bien metido", Toast.LENGTH_SHORT).show()
                enemigo.vida=enemigo.vida - personaje1.fuerza
                binding.progressBarEnemigo.progress=enemigo.vida
                println("Enemigo:"+enemigo.vida)
                if(enemigo.vida<=0){
                    Toast.makeText(this, "Enemigo muerto", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    personaje1.mochila.addArticulo(Objetos(),this)
                    personaje1.mochila.addArticulo(Objetos(),this)
                    personaje1.mochila.addArticulo(Objetos(),this)
                    personaje1.monedero[100] = personaje1.monedero[100]!! +1

                    print(personaje1.mochila.getContenido().count())
                }else{
                    personaje1.vida=personaje1.vida - enemigo.ataque / personaje1.defensa
                    binding.progressBarUsuario.progress= personaje1.vida
                    println("Usuario:"+personaje1.vida)
                }
                if (personaje1.vida<=0){
                    val intent = Intent(this, muerte::class.java)
                    startActivity(intent)
                }
            } else {
                Toast.makeText(this, "Ataque fallido", Toast.LENGTH_SHORT).show()

            }
        }

        /**Boton huir**/
        binding.botonhuirP.setOnClickListener() {
            var ataqueRandomH: Int = (1..6).random()
            if (ataqueRandomH in 5..6) {
                Toast.makeText(this, "Ole ole que has huido", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "No has podido huir", Toast.LENGTH_SHORT).show()
            }
        }


        binding.botonObjeto.setOnClickListener(){
            if(personaje1.mochila.getContenido().isNotEmpty()){
                if (personaje1.vida +20 <=200){
                    personaje1.mochila.getContenido().removeAt(0)
                    personaje1.vida=personaje1.vida+20
                    binding.progressBarUsuario.progress= personaje1.vida
                    Toast.makeText(this, "Has sumado +20", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "Si casi tienes toda la vida", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "No hay objetos", Toast.LENGTH_SHORT).show()
            }
        }

    }
}