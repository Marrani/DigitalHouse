package excercício05

fun main (){
    var veiculo = Veiculo("Chevrolet", "Onix", 2020, "Branca", 0)
    var cliente = Cliente("Gabriel", "Marrani", "22252627")
    var concessionaria = Concessionaria()
    var venda = Venda(veiculo, cliente, 80000.00)

    concessionaria.registrarVenda(venda)


}