import java.math.BigDecimal

//2. Faça um Programa que pergunte quanto você ganha por hora e o número de horas
//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

fun main(){
    println("Quanto vale sua hora?")
    var valorHora = readLine()!!.toDouble()

    println("Quantas horas você trabalhou?")

    var horasTrab = readLine()!!.toDouble()

    var salario:BigDecimal = valorHora.toBigDecimal() * horasTrab.toBigDecimal()

    println("Você receberá R$ $salario")

}