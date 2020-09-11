package Nivel01

fun main(){
    print("Digite a primeira nota:")
    val nota01 = readLine()!!.toInt();
    print("Digite a segunda nota:")
    val nota02 = readLine()!!.toInt();

    val media = (nota01 + nota02) / 2

    if(media == 10){
        println("Aprovado com Distinção")

    } else if (media >= 7){
        println("Aprovado")
    } else print("Reprovado")


}