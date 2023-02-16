package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityLoginBinding
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.botonIniciarSesion.setOnClickListener(){
            FirebaseAuth.getInstance().signInWithEmailAndPassword(binding.editTextEmail.text.toString(),binding.editTextPassword.text.toString()).addOnCompleteListener {
                if (it.isSuccessful){
                    val intent= Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "Error al autentificar el usuario", Toast.LENGTH_SHORT).show()

                }
            }

        }
        binding.textViewRegistro.setOnClickListener(){
            val intent= Intent(this, registrado::class.java)
            startActivity(intent)
        }
    }
}