


fun main(){
    print("Digite um número:")
    when(readLine()!!.toInt() % 2){
        0 -> println("Par")
        else -> println("Ímpar")
    }
}