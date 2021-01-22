package com.example.miprimeraappkotling


fun main() {
    val jake = Persona()
    val stringDescription = jake.apply {

        name = "Jake"
        var age = 30
        var about = "Android developer"
    }.toString()
}

class Persona {
    var name: String = ""
    var age: Int = 0
    var about: String = ""
}
