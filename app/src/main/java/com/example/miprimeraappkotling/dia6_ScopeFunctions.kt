package com.example.miprimeraappkotling

fun main(){
    val empty = "test".let {
    customPrint(it)
        it.isEmpty()
    }
    println("is empty: $empty")

    printNonNull(null)
    printNonNull("my string")
}

fun printNonNull(str: String?){
    println("Printing \"$str\":")
    str?.let {
        print("\t")
        customPrint(it)
        println()
    }
}


fun customPrint(string: String){
    println("Esta funcion imprime lo que pases $string")
}
