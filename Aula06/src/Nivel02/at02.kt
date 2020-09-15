package Nivel02

fun main() {
    var notas = arrayOf(100, 50, 10, 5, 1)
    println("Quanto você quer sacar?")
    var valor = readLine()!!.toInt()
    if (valor in 10..600) {
        for (i in notas.indices) {
            var numeroNotas = valor / notas[i]
            valor = valor % notas[i]
            if (numeroNotas > 0) {
                println("$numeroNotas de ${notas[i]}")
            }
        }
    } else {
        println("Saque não permitido!")
    }
}