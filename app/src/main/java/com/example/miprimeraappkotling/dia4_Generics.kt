package com.example.miprimeraappkotling

fun main(){

    val example = GenericClass("palabra 1",
            "palabra 2",
            "palabra 3")

    /* println(example.size()) */

    example.addElemento( element = "palabra 4")

    println(example.size())

    val example2 = GenericClass( 2,3,4,5,6,7)
    println(example2.size())
}

class GenericClass<T>(vararg items: T){

    private val listadoElementos = items.toMutableList()

    fun addElemento(element: T) = listadoElementos.add(element)

    fun size() = listadoElementos.size

}

fun <T> funcionExampleGeneric(vararg element: T) = GenericClass(element)