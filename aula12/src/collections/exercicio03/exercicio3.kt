package collections.exercicio03

fun main(){
    var prova = Prova()
    val inteiros = mutableSetOf<Int>()
    inteiros.add(10)
    inteiros.add(2)
    inteiros.add(5)

   print(prova.somaTotal(inteiros))
}
