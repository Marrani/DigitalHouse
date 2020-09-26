package collections.exercicio04

abstract class  Peca(var marca:String, var modelo:String) {

    abstract fun retirada()
    override fun toString(): String {
        return "Peca(marca='$marca', modelo='$modelo')"
    }

}