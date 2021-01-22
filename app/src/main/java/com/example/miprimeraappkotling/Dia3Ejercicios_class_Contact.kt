package com.example.miprimeraappkotling

fun main(){
    val contact = Contact(id = 10 , email = "ingetecnproypereira@gmail.com")
    println(contact.id)
    println(contact.email)
    contact.email = "cristian.vidal@gmail.com"

}

class Contact(val id: Int, var email:String)
class Personas(var name:String, val apellido:String)

