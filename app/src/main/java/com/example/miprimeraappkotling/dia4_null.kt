package com.example.miprimeraappkotling

fun main(){

    var nullString = null
    var stringNotNull = "Algo pasa"

    println(describeString(stringNotNull))

}

fun describeString(maybeString: String?) : String {
   if (maybeString != null && maybeString.isNotEmpty()){
       return "El largo del String es ${maybeString.length}"
    } else {
        return  "Empty or null String"
    }
}