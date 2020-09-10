//4. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
//rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o
//estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar
//uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que
//leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a
//quantidade de quilos além do limite e na variável multa o valor da multa que João deverá
//pagar. Imprima os dados do programa com as mensagens adequadas.
//Exemplo:
//Digite o peso dos peixes: 75
//Excedeu 25Kg
//O Valor a ser pago é de R$ 100,00

fun main(){
    println("Digite o kg total dos peixes")

    var peixePeso = readLine()!!.toDouble()
    var pesoLimite = 50
    var multa = 4
    var excedeu = peixePeso - pesoLimite
    var valorPago = excedeu * multa;

    println(peixePeso)
    println("Excedeu: $excedeu")
    println("O Valor a ser pago é de R$ $valorPago")



}