fun solicitarTotalAlumnos(): Int {
    print("Ingrese el número de alumnos en el salón: ")
    return readLine()?.toIntOrNull() ?: 0
}

fun solicitarEdad(numeroAlumno: Int): Int {
    print("Ingrese la edad del alumno $numeroAlumno: ")
    return readLine()?.toIntOrNull() ?: 0
}

fun mostrarEstadisticas(edades: IntArray) {
    val edadMaxima = edades.maxOrNull() ?: 0
    val edadMinima = edades.minOrNull() ?: 0

    println("=== Edades ===")
    println("Máximo = $edadMaxima")
    println("Mínimo = $edadMinima")
    print("Todos = ")
    for (i in 0 until edades.size) {
        print(edades[i])
        if (i < edades.size - 1) {
            print(", ")
        }
    }
    println()
}
fun main() {
    val totalAlumnos = solicitarTotalAlumnos()
    val edades = IntArray(totalAlumnos) { 0 }

    for (i in 0 until totalAlumnos) {
        edades[i] = solicitarEdad(i + 1)
    }

    mostrarEstadisticas(edades)
}