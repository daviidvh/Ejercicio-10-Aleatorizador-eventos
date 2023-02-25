package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth


class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Login"
        /**Creamos la musica**/
        mediaPlayer = MediaPlayer.create(this, R.raw.musica)
        /**Nos posicionamos en el segundo 0**/
        mediaPlayer.seekTo(0)
        /**Empieza a sonar la musica**/
        mediaPlayer.start()
        /**Hacemos la musica infinita**/
        mediaPlayer.isLooping = true


        binding.btnpausa.setOnClickListener() {
            /**Atraves del metodo pause pausamos la musica**/
            mediaPlayer.pause()
        }

        binding.btnplay.setOnClickListener() {
            /**Con el metodo start volvemos a empezar la musica**/
            mediaPlayer.start()
        }



        binding.botonIniciarSesion.setOnClickListener() {
            if (binding.editTextEmail.text.isNotEmpty() && binding.editTextPassword.text.isNotEmpty()) {
                FirebaseAuth.getInstance().signInWithEmailAndPassword(
                    binding.editTextEmail.text.toString(),
                    binding.editTextPassword.text.toString()
                ).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val intent = Intent(this, pantallaClases::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Error al autentificar el usuario", Toast.LENGTH_SHORT)
                            .show()

                    }

                }

            } else {
                Toast.makeText(this, "Rellena todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
        binding.textViewRegistro2.setOnClickListener() {
            Toast.makeText(this, "Vamos al registro", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, registrado::class.java)
            startActivity(intent)
        }
    }
}