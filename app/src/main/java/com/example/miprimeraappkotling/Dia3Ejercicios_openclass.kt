package com.example.miprimeraappkotling

fun main(){

    val perrito = Dog()
    perrito.sayHello()
    val cholito = Yorkshire()
    cholito.sayHello()
}

open class Dog{
    open fun sayHello(){
        println("Wow wow")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("Wif wif")
    }

}