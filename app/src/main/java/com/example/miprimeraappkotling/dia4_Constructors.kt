package com.example.miprimeraappkotling

fun main (){

    val gatito1 = Gato( name = "misifus", age= 29)
    val gatito2 = Gato( breed = "angora")
    val gatito3 =Gato()
}

class Gato(){

    constructor(name: String, age:Int) : this()

    constructor(breed: String) : this()

    init {
        println("miau")
    }

    private val legs: Int
    init {
        legs = 4
    }

}
