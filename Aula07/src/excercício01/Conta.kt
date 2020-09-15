package excercício01

import java.math.BigDecimal
import excercício01.Cliente

class Conta (cliente: Cliente){

    var numeroConta:Long = 0L
    var saldo: Double = 00.00
    var titular = cliente

    fun depositar(dinheiro:Double){
        saldo+= dinheiro
        print("Deposito efetuado com sucesso!")
        println("Saldo $saldo")
    }

    fun sacar(dinheiro: Double){

        saldo - dinheiro
        if(dinheiro > saldo){
            println("Saldoinsuficiente")
        } else {
            println("Saque efetuado com sucesso!!")
            println("Saldo atual: $saldo")
        }


    }
}