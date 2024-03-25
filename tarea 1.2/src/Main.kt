import kotlin.random.Random
fun jugarPiedraPapelTijera() {
    val opciones = arrayOf("piedra", "papel", "tijera")
    val opcionComputadora = opciones[Random.nextInt(opciones.size)]

    print("Elige piedra, papel o tijera: ")
    val opcionUsuario = readLine()?.toLowerCase()

    if (opcionUsuario in opciones) {
        println("La computadora elige: $opcionComputadora")
        println("Tú eliges: $opcionUsuario")

        if (opcionUsuario == opcionComputadora) {
            println("¡Es un empate!")
        } else if ((opcionUsuario == "piedra" && opcionComputadora == "tijera") ||
            (opcionUsuario == "papel" && opcionComputadora == "piedra") ||
            (opcionUsuario == "tijera" && opcionComputadora == "papel")) {
            println("¡Ganaste!")
        } else {
            println("¡Perdiste!")
        }
    } else {
        println("Opción no válida. Por favor, elige piedra, papel o tijera.")
    }
}
fun main() {
    jugarPiedraPapelTijera()
}
