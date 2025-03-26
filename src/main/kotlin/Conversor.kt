package org.example

class Conversor {

    // Convierte grados Celsius a Fahrenheit
    fun celsiusAFahrenheit(celsius: Double): Double {
        return (celsius * 9/5) + 32
    }

    // Convierte grados Fahrenheit a Celsius
    fun fahrenheitACelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * 5/9
    }

    // Convierte kilometros a millas
    fun kilometrosAMillas(km: Double): Double {
        return km * 0.621371
    }

    // Convierte millas a kilometros
    fun millasAKilometros(millas: Double): Double {
        return millas / 0.621371
    }

    // Convierte kilogramos a Libras
    fun kilogramosALibras(kg: Double): Double {
        return kg * 2.20462
    }

    // Convierte Libras a kilogramos
    fun librasAKilogramos(libras: Double): Double {
        return libras / 2.20462
    }

}