package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaMercaderBinding

class pantallaMercader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaMercaderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonComprar.visibility = View.INVISIBLE
        binding.botonVender.visibility = View.INVISIBLE
        binding.botonCancelar.visibility = View.INVISIBLE

        binding.textViewInfo.visibility=View.INVISIBLE
        binding.editTextNumArticulos.visibility=View.INVISIBLE
        binding.botonCarrito.visibility= View.INVISIBLE

        binding.botonComerciar.setOnClickListener(){

            binding.botonComerciar.visibility = View.INVISIBLE
            binding.botonContinuarMer.visibility = View.INVISIBLE

            binding.botonComprar.visibility = View.VISIBLE
            binding.botonVender.visibility = View.VISIBLE
            binding.botonCancelar.visibility = View.VISIBLE

            //BOTON COMPRAR
            binding.botonComprar.setOnClickListener(){
                binding.textViewInfo.visibility=View.VISIBLE
                binding.editTextNumArticulos.visibility=View.VISIBLE
                binding.botonCarrito.visibility= View.VISIBLE
                binding.botonCarrito.setOnClickListener(){

                }

            }


            //BOTON VENDER
            binding.botonVender.setOnClickListener() {
                /*Quitar cosas de boton comprar */
                binding.textViewInfo.visibility = View.INVISIBLE
                binding.editTextNumArticulos.visibility = View.INVISIBLE
                binding.botonCarrito.visibility= View.INVISIBLE
            }

            //BOTON CANCELAR
            binding.botonCancelar.setOnClickListener(){
                binding.botonComerciar.visibility = View.VISIBLE
                binding.botonContinuarMer.visibility = View.VISIBLE
                binding.botonComprar.visibility = View.INVISIBLE
                binding.botonVender.visibility = View.INVISIBLE
                binding.botonCancelar.visibility = View.INVISIBLE
                /*Quitar cosas de boton comprar */
                binding.textViewInfo.visibility=View.INVISIBLE
                binding.editTextNumArticulos.visibility=View.INVISIBLE
                binding.botonCarrito.visibility= View.INVISIBLE

                /* Quitar cosas de boton vender*/


            }
        }

        binding.botonContinuarMer.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}