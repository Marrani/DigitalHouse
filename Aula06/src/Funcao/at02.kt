package Funcao
//Faça um programa, com uma função que necessite de um argumento. A função
//retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu
//argumento for zero ou negativo.

fun main(){
print("Digite um numero:")
    var numero = readLine()!!.toInt()
    println(retornarCaractere(numero))
}

fun retornarCaractere(numero:Int) : Char {
    if(numero > 0){
        return 'P'
    } else return 'N'

}
