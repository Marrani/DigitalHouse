package collections.exercicio04

class GuardaVolumes {
    var dicionario = mutableMapOf<Int, List<Peca>>()
    var contador = 0

    fun guardarPecas(listaDePeca: MutableList<Peca>): Int{
        var identificador = contador

        dicionario[contador] = listaDePeca
        contador++
        return identificador

    }

    fun mostrarPecas(): Int {
        dicionario.forEach{
           println(it.key)
           println(it.value)
        }
        return -1
    }

    fun mostrarPecas(numero: Int){
        print(dicionario.get(key = numero))
    }

    fun devolverPecas(numero: Int){
        dicionario.remove(numero)
    }


}