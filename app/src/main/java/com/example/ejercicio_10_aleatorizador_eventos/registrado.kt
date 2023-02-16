package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityRegistradoBinding
import com.google.firebase.auth.FirebaseAuth

class registrado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRegistradoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title="Registro"

        binding.botonRegistrar.setOnClickListener() {
            if (binding.editTextEmailRegistro.text.isNotEmpty() && binding.editTextTextPassword.text.isNotEmpty()){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    binding.editTextEmailRegistro.text.toString(),
                    binding.editTextTextPassword.text.toString()
                ).addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Se ha registrado al usuario", Toast.LENGTH_SHORT)
                            .show()
                        val intent= Intent(this, login::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Error al autentificar el usuario", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }else{
               Toast.makeText(this, "Rellena todos los campos", Toast.LENGTH_SHORT).show()
             }
        }
    }
}