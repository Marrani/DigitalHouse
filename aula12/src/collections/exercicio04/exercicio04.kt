package collections.exercicio04

fun main(){
    var pecas = mutableListOf<Pertence>(Pertence("xtt", "tyz"))

    var guardaVolumes = GuardaVolumes()

    guardaVolumes.guardarPecas(pecas.toMutableList())

    pecas = mutableListOf<Pertence>(Pertence("jjj", "tyz"))

    guardaVolumes.guardarPecas(pecas.toMutableList())

    guardaVolumes.mostrarPecas()

    guardaVolumes.devolverPecas(1)

    guardaVolumes.mostrarPecas()




}