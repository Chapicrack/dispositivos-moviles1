import kotlin.random.Random


fun jugarAdivinaNumero() {
    val numeroAdivinar = Random.nextInt(1, 31)
    var intentos = 5
    var adivinado = false

    println("¡Bienvenido al juego de Adivina el Número!")
    println("Tienes 5 intentos para adivinar un número entre 1 y 30.")

    while (intentos > 0 && !adivinado) {
        print("Ingresa tu adivinanza: ")
        val intento = readLine()?.toIntOrNull()

        if (intento == null || intento !in 1..30) {
            println("Por favor, ingresa un número válido entre 1 y 30.")
            continue
        }

        when {
            intento < numeroAdivinar -> println("El número a adivinar es mayor.")
            intento > numeroAdivinar -> println("El número a adivinar es menor.")
            else -> {
                println("¡Felicitaciones! ¡Has adivinado el número correctamente!")
                adivinado = true
            }
        }

        intentos--
    }

    if (!adivinado) {
        println("¡Game over! El número a adivinar era: $numeroAdivinar")
    }
}
fun main() {
    jugarAdivinaNumero()
}