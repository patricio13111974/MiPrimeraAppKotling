package com.example.miprimeraappkotling

fun main(){

    val listaNumeros = mutableListOf(1,3,4,6,7,8, -1, -100, 3)
    val listadoString = mutableListOf("Some", "Something", "algo", "jose", "Something")

    val ordenados = listaNumeros.sortedBy { -it }
    val stringOrdenados = listadoString.map { it.toLowerCase() }
    println(stringOrdenados.sorted())

}