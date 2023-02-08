package com.example.ejercicio_10_aleatorizador_eventos


class Mochila(private var pesoMochila: Int){
     private var contenido=ArrayList<Objetos>()

     fun getPesoMochila():Int{
          return pesoMochila
     }
     fun addArticulo(articulo:Objetos){
          if (articulo.getPeso()<=pesoMochila){
               contenido.add(articulo)
               this.pesoMochila-=articulo.getPeso()
          }else{
               println("La mochila está llena")
          }
          println("Peso restante de la Mochila: "+pesoMochila)

     }
     fun getContenido(): ArrayList<Objetos> {
          return contenido
     }

}