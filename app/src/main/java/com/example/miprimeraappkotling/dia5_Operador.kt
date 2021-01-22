package com.example.miprimeraappkotling

fun main(){
    var perro = Perro()
    perro.raza?.nombre
}

class Raza {
    var nombre: String? = null
}

class Perro{
    var raza: Raza? = null
}

