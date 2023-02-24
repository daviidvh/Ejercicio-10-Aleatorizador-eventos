package com.example.ejercicio_10_aleatorizador_eventos

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class muerte : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_muerte)
        mediaPlayer.pause()
        var mediaPlayer2 = MediaPlayer.create(this, R.raw.gameover)
        /**Nos posicionamos en el segundo 0**/
        mediaPlayer2.seekTo(0)
        /**Empieza a sonar la musica**/
        mediaPlayer2.start()
        /**Hacemos la musica infinita**/


    }
}