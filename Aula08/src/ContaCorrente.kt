
class ContaCorrente(private val taxaOperacao: Int, numeroConta: Int, saldo: Double) : ContaBancaria(numeroConta, saldo) {
    override fun sacar(valor:Double):Boolean {
        if(valor > valor + taxaOperacao){
            println("Saldo Insuficiente")
            return false
        } else {
            saldo -= valor + taxaOperacao
            return true
        }

    }

    override fun depositar(valor:Double):Boolean {
        if(valor + saldo >= taxaOperacao ){
            saldo += valor - taxaOperacao
            println("Deposito efetuado!!")

        }
        return true
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Taxa de operação: $taxaOperacao")
    }
}