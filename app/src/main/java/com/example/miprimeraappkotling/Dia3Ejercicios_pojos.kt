package com.example.miprimeraappkotling

fun main(){

    val student = StudentKotlin(name = "Zacarias", age = "46", address = "San Fco, Santiago Centro")
    val student2 = StudentKotlin(name = "Zacarias", age = "46", address = "San Fco, Santiago Centro")
    //1  println("Verificar si student y student2 son equivalentes ${student == student2}")

}

//1  compara 2 elementos para determinar si es true o false
data class StudentKotlin(var name: String = "Patricio", var age:String, var address: String)
