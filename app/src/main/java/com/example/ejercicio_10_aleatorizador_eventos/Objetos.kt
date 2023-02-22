package com.example.ejercicio_10_aleatorizador_eventos

class Objetos (private var peso:Int=10, private var valor:Int=125, private var vida:Int=20):java.io.Serializable {
    fun getPeso(): Int {
        return peso
    }
    fun getValor():Int{
        return valor
    }
}