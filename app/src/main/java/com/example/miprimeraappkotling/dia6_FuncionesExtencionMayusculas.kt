package com.example.miprimeraappkotling

fun main(){

   val palabra = "algo en minuscula"
   println(palabra.algo())
}

fun String.algo(): String{
    return this.toUpperCase()
}
