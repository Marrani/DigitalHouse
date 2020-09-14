package Funcao

import kotlin.random.Random

fun main() {
    executar()
}

fun rolarDados(): Int = Random.nextInt(2, 12)

fun resultado() {
    var valor = rolarDados()
    when (valor) {
        7, 11 -> println("Você tirou $valor! Parabéns você ganhou!")
        2, 3, 12 -> println("Você tirou $valor Craps você perdeu")
        4, 5, 6, 8, 9, 10 -> verificar(valor)
    }

}

fun verificar(valor: Int) {
    print("você tirou $valor, Rolar dados? (s ou n)")
    var opcaoContinue = readLine()
    var valorAnterior = valor
    var segundoValor = 0
    while (segundoValor != 7) {
        segundoValor = rolarDados()

        if (segundoValor == valorAnterior) {
            println("Ganhouuuu")
            break
        } else if (segundoValor == 7) {
            println("Você tirou 7! Você perdeu =(")
        }

    }


}

fun executar() {
    do {
        println("Rolar dados? (s ou n)?: ")
        val opcao = readLine()!!.toLowerCase()
        if (opcao == "s") {
            resultado()

        } else {
            return
        }

    } while (true)
}