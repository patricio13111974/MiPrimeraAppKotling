package com.example.miprimeraappkotling

fun main() {
    println(saludarAlMamifero(Mamifero.Gato(nombreGato = "Juanito")))
    println(saludarAlMamifero(Mamifero.Perro(nameDog = "Doggy")))
    println(saludarAlMamifero(Mamifero.Humano(nombreHumano = "Pedrito")))
}

sealed class Mamifero(val name: String) {
    class Gato(val nombreGato: String) : Mamifero(nombreGato)
    class Humano(val nombreHumano: String) : Mamifero(nombreHumano)
    class Perro(val nameDog: String) : Mamifero(nameDog)
}

sealed class Planet(val id: Int) {
    class BasicPlanet(id: Int) : Planet(id)
    class PlanetWithSatellites(id: Int, val satellitesNames: List<String>) : Planet(id)
}
    fun saludarAlMamifero(Mamifero: Mamifero) {
        when (Mamifero) {
            is Mamifero.Humano -> "Hola humano de nombre ${Mamifero.name}"
            is Mamifero.Gato -> "Hola gato de nombre ${Mamifero.name}"
            is Mamifero.Perro -> "Hola perro de nombre ${Mamifero.name}"
        }
    }
//class Perro(val nameDog:String) : Mamifero(nameDog)