package com.example.ejercicio_10_aleatorizador_eventos


class Personaje(private var nombre: String="",private var clase:String="", private var raza:String, private var  vida:Int,private var fuerza:Int, var mochila: Mochila=Mochila(100)):java.io.Serializable {

    var monedero: HashMap<Int, Int> = HashMap<Int, Int>()
    init {
        monedero.put(1, 0)
        monedero.put(5, 0)
        monedero.put(10, 0)
        monedero.put(25, 0)
        monedero.put(100, 0)
    }
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
    fun getFuerza(): Int {
        return fuerza
    }
    fun setFuerza(newFuerza: Int){
        fuerza=newFuerza
    }


}
