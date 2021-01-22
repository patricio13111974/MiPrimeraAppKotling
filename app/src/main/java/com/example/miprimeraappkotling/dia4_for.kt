package com.example.miprimeraappkotling

fun main(){

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (item in cakes){
        //println("Me comí un pastel de $item")
    }

    for (i in 0..10){
        println("el valor es $i")
    }

    for (i in 'z' downTo 'z'){
        println("el valor es $i")
    }

    val num = 6

    if (num in 1..10){
        println("esta en el rango")
    }
}