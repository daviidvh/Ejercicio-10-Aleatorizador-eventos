package com.example.ejercicio_10_aleatorizador_eventos


class Personaje(private var nombre: String="",private var clase:String="", private var raza:String, private var  vida:Int,var mochila: Mochila=Mochila(100)):java.io.Serializable {


    fun getClase(): String {
        return clase
    }
    fun setClase(newclase: String){
        clase=newclase
    }

    fun getRaza(): String {
        return raza
    }
        fun setRaza(newRaza: String){
        raza=newRaza
    }


    fun getNombre(): String {
        return nombre
    }
    fun setNombre(newnombre: String){
        clase=newnombre
    }


    fun getVida(): Int {
        return vida
    }
    fun setVida(newVida: Int){
        vida=newVida
    }

}
