package com.example.ejercicio_10_aleatorizador_eventos

import android.widget.Toast



class Mochila(private var pesoMochila: Int){
     private var contenido=ArrayList<Objetos>()
     fun addArticulo(articulo:Objetos){
          if (articulo.getPeso()<=pesoMochila){
               contenido.add(articulo)
               this.pesoMochila-=articulo.getPeso()
          }else{
               //Toast.makeText(this, "Añadiendo el objeto a la mochila", Toast.LENGTH_SHORT).show()
               println("La mochila está llena")
          }
          println("Peso restante de la Mochila: "+pesoMochila)

     }


}