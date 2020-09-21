package parte02

import kotlin.math.max

class Item(var numero:Int,
           var descricao:String,
           var quantidade:Int,
           var preco:Double) {

    init {
        quantidade = max(0, quantidade)
        preco = max(0.0, preco)
    }

}