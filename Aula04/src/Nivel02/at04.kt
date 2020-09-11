//1. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e
//mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9)

fun main(){
    println("Favor digitar uma temperatura em graus Fahrenheit");
    var temperaturaF = readLine()!!.toDouble();
    var temperaturaC = 5 * ((temperaturaF - 32) / 9);

    println("Temperatura em graus celsius $temperaturaC")
}
