fun main (){

    val pessoa1 =  Pessoa("Gabriel", Estado("ES", "Espirito Santo"))
    val pessoa2 =  Pessoa("Gabriel", Estado("SP", "São Paulo"))
    val pessoa3 =  Pessoa("Gabriel", Estado("RJ", "Rio de Janeiro"))
    val pessoas = listOf(pessoa1, pessoa2, pessoa3)

    val agruparPorEstado = mutableMapOf<String, MutableList<Pessoa>>()

    agruparPorEstado.forEach{
        it.key
    }

    print(pessoas.groupBy { it.estado.sigla })
}
