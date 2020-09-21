var banco = Banco()

fun main() {

    do {
        menus()
        println("Digite uma opção:")
        var opcao = readLine()!!.toInt()

        when (opcao) {
            1 -> criarConta()
            2 -> mostrarSubmenuConta()
            3 -> removerConta()
            4 -> gerarRelatorios()
            5 -> return
            else -> println("Opção inválida")

        }

    } while (true)


}

fun menus() {
    println()
    println("1 - Criar conta ")
    println("2 - Selecionar Conta")
    println("3 - Remover conta")
    println("4 - Gerar relatório")
    println("5 - Finalizar")
    println()
}

fun criarConta() {
    println()
    do {
        println("Tipo da conta: ")
        println("1 - Conta Corrente")
        println("2 - Conta Poupança")
        val tipoConta = readLine()!!.toInt()
        println("--------")
        when (tipoConta) {
            1 -> {
                print("Número da conta: ")
                val numeroConta = readLine()!!.toInt()
                banco.inserir(ContaCorrente(5, numeroConta, 0.0))
                println("Conta crida com sucesso")
                return
            }
            2 -> {
                print("Número da conta: ")
                val numeroConta = readLine()!!.toInt()
                banco.inserir(ContaPoupanca(600.00, numeroConta, 0.0))
                println("Conta crida com sucesso")
                return
            }
            else -> println("Opção inválida")
        }
    } while (true)
}

fun mostrarSubmenuConta() {
    println("--------")
    println("a - Depositar")
    println("b - Sacar")
    println("c - Transferir")
    println("d - Gerar relatório")
    println("e - Retornar ao menu principal")

}

fun selecionarConta() {
    println()

    val numConta = readLine()!!.toInt()
    val conta = banco.procurarConta(numConta)
    if (conta != null) {
        loop@ do {
            mostrarSubmenuConta()
            val opcao = readLine()!!
            println("--------")
            when (opcao) {
                "a" -> {
                    print("Valor a depositar: ")
                    val valor = readLine()!!.toDouble()
                    conta.depositar(valor)
                }
                "b" -> {
                    print("Valor a sacar: ")
                    val valor = readLine()!!.toDouble()
                    conta.sacar(valor)
                }
                "c" -> {
                    print("Informe a conta destino: ")
                    val destino = readLine()!!.toInt()
                    val contaDestino = banco.procurarConta(destino)
                    if (contaDestino != null) {
                        print("Valor a transferir: ")
                        val valor = readLine()!!.toDouble()
                        conta.transferir(valor, contaDestino)
                    }
                }
                "d" -> {
                    conta.mostrarDados()
                }
                "e" -> break@loop
                else -> println("Opção inválida")
            }
        } while (true)
    }
}


fun removerConta() {
    println()
    val numConta = readLine()!!.toInt()
    println()
    val conta = banco.procurarConta(numConta)
    if (conta != null) {
        banco.remover(conta)
        println("Conta removida com sucesso.")
    }
}

fun gerarRelatorios() {
    println()
    banco.mostrarDados()
}

