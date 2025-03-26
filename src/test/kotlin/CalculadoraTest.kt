package org.example

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CalculadoraTest {
    private val calculadora = Calculadora()

    @Test
    fun testSuma(){
        assertEquals(5,calculadora.sumar(2,3))
        assertEquals(4,calculadora.sumar(2,2))
    }

    @Test
    fun testResta(){
        assertEquals(1,calculadora.restar(3,2))
        assertEquals(-5,calculadora.restar(0,5))
    }

    @Test
    fun testMultiplicar(){
        assertEquals(6,calculadora.multiplicar(3,2))
        assertEquals(0,calculadora.multiplicar(5,0))
    }

    @Test
    fun testDivision(){
        assertEquals(2.0,calculadora.dividir(6,3))
        assertEquals(2.5,calculadora.dividir(5,2))
    }

    @Test
    fun testDivisionPorCero(){
        assertFailsWith<IllegalArgumentException> {
            calculadora.dividir(5,0)    }
    }
}