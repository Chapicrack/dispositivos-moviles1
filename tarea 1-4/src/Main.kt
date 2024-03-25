fun main() {
    var opcion: Int

    do {
        mostrarMenu()
        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> realizarOperacion("Suma")
            2 -> realizarOperacion("Resta")
            3 -> realizarOperacion("Multiplicación")
            4 -> realizarOperacion("División")
            5 -> println("¡Hasta luego!")
            else -> println("Opción no válida. Por favor, seleccione una opción del menú.")
        }
    } while (opcion != 5)
}

fun mostrarMenu() {
    println("==== Menú ====")
    println("1. Suma")
    println("2. Resta")
    println("3. Multiplicación")
    println("4. División")
    println("5. Salir")
    print("Seleccione una opción: ")
}

fun realizarOperacion(nombreOperacion: String) {
    print("Ingrese el primer número: ")
    val num1 = readLine()?.toDoubleOrNull()
    print("Ingrese el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 != null && num2 != null) {
        when (nombreOperacion) {
            "Suma" -> println("Resultado de la suma: ${num1 + num2}")
            "Resta" -> println("Resultado de la resta: ${num1 - num2}")
            "Multiplicación" -> println("Resultado de la multiplicación: ${num1 * num2}")
            "División" -> {
                if (num2 != 0.0) {
                    println("Resultado de la división: ${num1 / num2}")
                } else {
                    println("No se puede dividir por cero.")
                }
            }
        }
    } else {
        println("Por favor, ingrese números válidos.")
    }
}
