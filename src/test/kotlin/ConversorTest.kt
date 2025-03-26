package org.example

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class ConversorTest {
    private val conversor = Conversor()

    @Test
    fun testCelsiusAFahrenheit() {
        assertEquals(68.0,conversor.celsiusAFahrenheit(20.0))
    }

    @Test
    fun testFahrenheitACelsius() {
        assertEquals(20.0,conversor.fahrenheitACelsius(68.0))
    }

    @Test
    fun testKilometrosAMillas() {
        assertEquals(3.106855,conversor.kilometrosAMillas(5.0))
    }

    @Test
    fun testMillasAKilometros() {
        assertEquals(5.0,conversor.millasAKilometros(3.106855))
    }

    @Test
    fun testKilogramosALibras() {
        assertEquals(22.0462,conversor.kilogramosALibras(10.0))
    }

    @Test
    fun testLibrasAKilogramos() {
        assertEquals(10.0,conversor.librasAKilogramos(22.0462))
    }
}