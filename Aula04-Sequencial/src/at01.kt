//1. Faça um Programa que peça as 4 notas bimestrais e mostre a média.

fun main(){
   println("Digite a nota 1:")

    var nota01 = readLine()!!.toFloat()

   println("Digite a nota 2:")

    var nota02 =  readLine()!!.toFloat()

   println("Digite a nota 3:")

    var nota03 = readLine()!!.toFloat()

   println("Digite a nota 4:")

    var nota04 = readLine()!!.toFloat()

    var media:Float = (nota01 + nota02 + nota03 + nota04) / 4

    println("A média é $media")

}