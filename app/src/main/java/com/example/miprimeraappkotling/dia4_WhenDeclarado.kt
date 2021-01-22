package com.example.miprimeraappkotling

fun main(){
    cases(1)
}

fun cases(objeto: Any) {
    when (objeto){
        1 -> println("One")
        "hello" -> println("Es un saludo")
        is Long -> println("es del tipo Long")
        !is String -> println("no es string")
        else -> println("No tengo idea que tipo es")
    }

}

//class Cat