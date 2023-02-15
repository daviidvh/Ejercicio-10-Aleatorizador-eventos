package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Context
import android.widget.Toast



class Mochila(private var pesoMochila: Int):java.io.Serializable {
     private var contenido=ArrayList<Objetos>()
     fun addArticulo(articulo:Objetos, context: Context){
          if (articulo.getPeso()<=pesoMochila){
               contenido.add(articulo)
               this.pesoMochila-=articulo.getPeso()
               Toast.makeText(context, "Añadiendo el objeto a la mochila", Toast.LENGTH_SHORT).show()
          }else{
               Toast.makeText(context, "La mochila esta llena", Toast.LENGTH_SHORT).show()
               println("La mochila está llena")
          }
          println("Peso restante de la Mochila: "+pesoMochila)

     }
     fun getContenido(): ArrayList<Objetos> {
          return contenido
     }
     fun getPesoMochila(): Int {
          return pesoMochila
     }

     fun setPeso(newPesoMochila: Int){
          pesoMochila=newPesoMochila
     }

}