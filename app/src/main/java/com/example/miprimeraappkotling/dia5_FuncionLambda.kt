package com.example.miprimeraappkotling

fun main(){

    val upperCase1: (String) -> String = {
    str: String -> str.toUpperCase()
    }

    val upperCaseSimple :(String) -> String ={ it.toUpperCase()}

    println(upperCase1("Hello con mayusculas"))
    println(upperCaseSimple("otro string en mayusculas"))

}


