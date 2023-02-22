package com.example.ejercicio_10_aleatorizador_eventos

class Monedero {
    fun cashConverter(articulo:Objetos){
        var total = 0
        var i = 0
        var coins = arrayListOf(1, 5, 10, 25, 100)
        coins.sortDescending()

        while(total < articulo.getValor() && i < coins.size) {
            if (total + coins[i] <= articulo.getValor()) {
                total += coins[i]
                personaje1.monedero[coins[i]] = personaje1.monedero[coins[i]]!! + 1
            } else
                i++
        }
    }
}