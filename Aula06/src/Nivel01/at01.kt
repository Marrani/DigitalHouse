package Nivel01

fun main (){
    val numeros = ArrayList<Int>()

    for( i in 1..5){
        numeros.add(readLine()!!.toInt())

    }
    print(numeros)


}