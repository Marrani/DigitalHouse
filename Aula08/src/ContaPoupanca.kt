
class ContaPoupanca(private val limite: Double, numeroConta: Int, saldo: Double) : ContaBancaria(numeroConta, saldo) {

    override fun sacar(valor: Double):Boolean {
    if(valor > (saldo + limite)){
       println("Saldo Insuficiente")
        return false
    }else {
        saldo -= valor
        println("Saque efetuado!!")
        return true
    }

    }

    override fun depositar(valor: Double):Boolean {
        println("Deposito efetuado!!")
        saldo+= valor
        return true
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite: $limite")
    }

    override fun transferir(valor: Double, destino: ContaBancaria) {
        val saldoContaOrigem = saldo
        if (!sacar(valor) || !destino.depositar(valor)){
            saldo = saldoContaOrigem
            println("Operação cancelada.")
        }
    }


}