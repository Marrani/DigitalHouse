package parte02

fun main (){
    var fatura01 = Fatura()
    var item01 = Item(1,"celular",2,3200.00)
    var item02 = Item(1,"celular",2,3200.00)
fatura01.getTotalFatura(item02)
   print(fatura01.getTotalFatura(item01))
}