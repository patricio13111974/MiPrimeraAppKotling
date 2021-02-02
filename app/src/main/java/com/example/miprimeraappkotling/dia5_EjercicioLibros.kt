package com.example.miprimeraappkotling

//2. crear clase
data class Librosescolares
(var nombre: String,
 var isbn: String,
 var numpag: Int,
 var precio: Int,
 var autor: String,
 var tipo: Char)


//3. crear funcion precioformateado
fun precioFormateado(precio:Int):String {
    return "$" + precio.toString()}

//4. crea funcion imprimir libros
fun imprimirLibros(libros: Librosescolares) {
    println (" Nombre: $(libros.nombre} , " +
            " ISBN: $(libros.isbn} , "  +
            " Paginas: $(libros.numpag} , " +
            " Precio: $(precioFormateado(libros.precio} , " +
            " Autor: $(libros.autor} , " +
            " Tipo: $(libros.tipo} ")

}

//5.crea funcion main
fun main() {

//6. Declaro 4 variables
    var libro1= Librosescolares("Principito", "abc123", 30, 100,"Exupery", 'I' )
    var libro2= Librosescolares("Principito2", "abc123", 35, 200,"Exupery", 'I' )
    var libro3= Librosescolares("Principito3", "abc123", 40, 300,"Exupery", 'I' )
    val libro4= Librosescolares("Principito4", "abc123", 45, 400,"Exupery", 'I' )

    //7. Llama funcion imprimir
    imprimirLibros(libro1)
    imprimirLibros(libro2)
    imprimirLibros(libro3)
    imprimirLibros(libro4)
}



