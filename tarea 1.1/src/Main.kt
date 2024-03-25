fun main() {
    val salarioMensual = solicitarSalarioMensual()
    val puntuacion = solicitarPuntuacion()

    val nivelRendimiento = obtenerNivelRendimiento(puntuacion)
    val cantidadDineroRecibido = calcularCantidadDinero(salarioMensual, puntuacion)

    println("Resultado:")
    println("Nivel de Rendimiento: $nivelRendimiento")
    println("Cantidad de Dinero Recibido: \$$cantidadDineroRecibido")
}

fun solicitarSalarioMensual(): Double {
    print("Ingrese su salario mensual: ")
    return readLine()?.toDoubleOrNull() ?: 0.0
}

fun solicitarPuntuacion(): Int {
    print("Ingrese su puntuación en la evaluación (0-10): ")
    return readLine()?.toIntOrNull() ?: 0
}

fun obtenerNivelRendimiento(puntuacion: Int): String {
    return when (puntuacion) {
        in 0..3 -> "Inaceptable"
        in 4..6 -> "Aceptable"
        in 7..10 -> "Meritorio"
        else -> "Puntuación no válida"
    }
}

fun calcularCantidadDinero(salarioMensual: Double, puntuacion: Int): Double {
    return salarioMensual * (puntuacion.toDouble() / 10.0)
}