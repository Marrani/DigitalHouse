package excercício04

fun main(){
    var newBeetle = Carro(10, nivelCombustivel = 40)
    newBeetle.andar(2)
    newBeetle.obterGasolina()
    newBeetle.adicionarGasolina(15)
}

private operator fun Int.invoke(i: Int) {

}
