package parte02

public class Fatura() {

    var itens = ArrayList<Item>()

    fun getTotalFatura(item: Item): Double {

        itens.add(item)
        var total:Double = 0.00
        itens.forEach {
        total +=  it.quantidade * it.preco

      }
        return total
    }


}
