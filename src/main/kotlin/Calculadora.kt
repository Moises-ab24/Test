package org.example

class Calculadora {
    fun sumar(a: Int, b: Int): Int {
        return a + b
    }

    fun restar(a: Int, b: Int): Int {
        return a - b
    }

    fun multiplicar(a: Int, b: Int): Int {
        return a * b
    }

    fun dividir(a: Int, b: Int): Double {
        require(b != 0) { "No se puede dividir por cero" }
        return a.toDouble() / b
    }
}