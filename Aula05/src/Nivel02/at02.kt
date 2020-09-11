package Nivel02

fun main(){
    println("Digite o valor do saque: ")
    var saque = readLine()!!.toInt()
    val minimo= 10
    val maximo= 600
    var notas: Int
    if(saque in minimo..maximo){
        notas= (saque/100)
        if(notas >= 1 ){
            println("$notas notas de 100 reais.")
        }
        saque -= (notas*100)
        notas = (saque/50)
        if(notas>=1){
            println("$notas notas de 50 reais.")
        }
        saque -= (notas*50)
        notas = (saque/10)
        if(notas>=1){
            println("$notas notas de 10 reais.")
        }
        saque -= (notas*10)
        notas = (saque/1)
        if(notas>=1){
            println("$notas nota (s) de 01 real.")
        }
    }else{
        println("Valor inválido.")
    }


}