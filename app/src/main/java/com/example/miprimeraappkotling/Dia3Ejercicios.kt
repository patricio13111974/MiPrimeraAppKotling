package com.example.miprimeraappkotling

//ejercicio N°3

fun main(){

    var nombre = "Patricio"
    var apellido = "Pereira"
    var edad = 46
    imprimirNombreCompleto(nombre, apellido, edad)
}

fun imprimirNombreCompleto(nombre: String, apellido: String, edad: Int) {
    println("$nombre $apellido $edad")

}