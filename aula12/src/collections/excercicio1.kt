package collections

fun main(){
    imprimir()

}

fun imprimir(){
    var dicionario = Dicionario()
    dicionario.loteriaSonhos.forEach{
        println(it)
    }
    println("--------------------")
    dicionario.apelidos.forEach{
        println(it)
    }
}
