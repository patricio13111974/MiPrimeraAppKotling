package com.example.miprimeraappkotling

import org.jetbrains.annotations.NotNull

fun main(){

    var neverNull : String? = null
    var studentNull : StudentKotlin? = null

    strLength(neverNull)

}
fun strLength(notNull: String?): Int {
    return notNull!!.length
}

data class StudentKotlin(var name: String = "Patricio", var age:String, var address: String