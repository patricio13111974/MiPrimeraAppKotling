package com.example.miprimeraappkotling

fun main(){                                                              //1

    println(calculador(num1 = 10, num2 = 20, operation = ::sumar))       //3
}                                                                        //1

fun calculador(num1:Int, num2:Int, operation: (Int, Int) -> Int): Int {  //2
    return operation(num1, num2)                                         //2
}                                                                        //2

fun sumar(num1: Int, num2: Int) = num1 + num2                            //4
/* fun multiplicar(num1: Int, num2: Int) = num1 * num2                   //5 pasando funcion * */