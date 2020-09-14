package Repeticao.Nivel01

fun main(){
    var numero: Int
    var maior =0
    for(num in 1..5){
        println("Insira um número: ")
        numero = readLine()!!.toInt()
        if(num==1){
            maior= numero
        }else if (numero>maior){
            maior= numero
        }
    }
    println("O maior número é $maior!")
}