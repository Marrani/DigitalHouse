package Funcao

import java.math.BigDecimal

//3. Faça um programa com uma função chamada somaImposto. A função possui
//dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas
//expressa em porcentagem e custo, que é o custo de um item antes do imposto. A
//função “altera” o valor de custo para incluir o imposto sobre vendas.

fun main(){
    println("Digite a taxa do imposto em porcentagem: ")
    val taxaImposto = readLine()!!.toDouble()

    println("Digite o custo do produto: ")

    val custo = readLine()!!.toBigDecimal()

   println(somaImposto(taxaImposto, custo))

}

fun somaImposto(taxaImposto:Double, custo: BigDecimal) :BigDecimal{
    var taxa = taxaImposto / 100
    var custo = custo + custo * taxa.toBigDecimal()
    return custo

}