package com.example.miprimeraappkotling

fun main(){

    val perrito = Dog()
    perrito.sayHello()
    val cholito = Yorkshire()
    cholito.sayHello()
}

open class dog{
    open fun sayHello(){
        println("Wow wow")
    }
}

class Yorkshire : dog() {
    override fun sayHello() {
        println("Wif wif")
    }

}