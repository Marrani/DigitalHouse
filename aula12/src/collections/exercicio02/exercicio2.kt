package collections.exercicio02

fun main(){
    var numeros = mutableListOf<Int>()
    numeros.add(1)
    numeros.add(5)
    numeros.add(5)
    numeros.add(6)
    numeros.add(7)
    numeros.add(8)
    numeros.add(8)
    numeros.add(8)
    println(numeros)


    var numerosSet = mutableSetOf<Int>()
    numerosSet.add(1)
    numerosSet.add(5)
    numerosSet.add(5)
    numerosSet.add(6)
    numerosSet.add(7)
    numerosSet.add(8)
    numerosSet.add(8)
    numerosSet.add(8)
    println(numerosSet)

}
