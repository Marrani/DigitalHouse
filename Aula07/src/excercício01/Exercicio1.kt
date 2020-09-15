package excercício01


     fun main (){
       var cliente01 = Cliente()
        cliente01.sobrenome("Marrani")
        cliente01.nome("Gabriel")

        var cliente02 = Cliente()
        cliente02.nome("Henrique")
        cliente02.sobrenome("Segantini")

        var conta01 = Conta(cliente01)
        conta01.numeroConta(123654)
        conta01.saldo(5230)
        conta01.titular(cliente01.nome)

        var conta02 = Conta(cliente01)
        conta01.numeroConta(555)
        conta01.saldo(8563)
        conta01.titular(cliente02.nome)

        conta01.depositar(6200.00)
        conta01.sacar(5000.00)

        conta02.depositar(6200.00)
        conta02.sacar(5000.00)
    }



private fun Conta.titular(i: String) {

}

private fun Conta.titular(i: Int) {

}

private fun Conta.saldo(i: Int) {

}

private fun Conta.numeroConta(i: Int) {

}

private operator fun String.invoke(s: String) {

}



