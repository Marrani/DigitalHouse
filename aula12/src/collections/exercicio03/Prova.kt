package collections.exercicio03

class Prova {
    var total = 0

  fun  somaTotal(conjuntoDeInteiros: MutableSet<Int>): Int {
      conjuntoDeInteiros.forEach{
        total += it
      }
      return total
  }

}