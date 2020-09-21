package excercício04

class Carro (var consumo:Int, var nivelCombustivel:Int = 0){


    fun andar(km:Int){
       nivelCombustivel -= (km * consumo)
        println(nivelCombustivel)
    }

    fun obterGasolina(){
        println(nivelCombustivel)
    }

    fun adicionarGasolina(litros:Int){
        nivelCombustivel += litros
        println(nivelCombustivel)
    }
}