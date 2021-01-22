package com.example.miprimeraappkotling

fun main(){

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")
    //val authors = listOf("Shakespeare", "Hemingway", "Twain")
    //val writers = listOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)  //1 el contenido es el mismo
    println(authors === writers)  //1 la instancia es diferente


}