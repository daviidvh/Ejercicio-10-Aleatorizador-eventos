package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth



class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title="Login"

        var mediaPlayer = MediaPlayer.create(this, R.raw.musica)
        mediaPlayer.seekTo(0)
        mediaPlayer.start()
        mediaPlayer.isLooping = true

        binding.btnpausa.setOnClickListener(){
            mediaPlayer.pause()
        }

        binding.btnplay.setOnClickListener(){
            mediaPlayer.start()
        }



        binding.botonIniciarSesion.setOnClickListener() {
            if (binding.editTextEmail.text.isNotEmpty() && binding.editTextPassword.text.isNotEmpty()) {
                FirebaseAuth.getInstance().signInWithEmailAndPassword(
                    binding.editTextEmail.text.toString(),
                    binding.editTextPassword.text.toString()
                ).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Error al autentificar el usuario", Toast.LENGTH_SHORT)
                            .show()

                    }
                }

            }else{
                Toast.makeText(this, "Rellena todos los campos", Toast.LENGTH_SHORT).show()
            }
            binding.textViewRegistro.setOnClickListener() {
                val intent = Intent(this, registrado::class.java)
                startActivity(intent)
            }
        }
    }
}