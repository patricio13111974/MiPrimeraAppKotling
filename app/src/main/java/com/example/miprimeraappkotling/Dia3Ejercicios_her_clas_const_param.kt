package com.example.miprimeraappkotling

fun main(){
    val tiger : Tiger =SiberianTiger( origen =  "china")
    tiger.sayHello()
    val tiger2 : Tiger =SiberianTiger( origen =  "indonesia")
    tiger2.sayHello()
}

open class Tiger(val origin: String, val color: String){
    open fun sayHello(){
        println("Un tigre de $origin dice Grrhhh!! soy de color $color")

    }
}

class SiberianTiger(val origen: String) : Tiger(origen, color = "naranjo")
