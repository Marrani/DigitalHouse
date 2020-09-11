//3. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que
//calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7 * h) - 58
//Para mulheres: (62.1 * h) - 44.7

fun main (){
    println("Vamos Calcular  seu peso ideal...")

    println("Digite a altura:")

    var altura = readLine()!!.toFloat();
    var pesoIdealHomen = (72.7 * altura) - 58
    var pesoIdealMulher = (62.1 * altura) - 44.7


    println("Para Homens: $pesoIdealHomen.")

    println("Para Mulheres: $pesoIdealMulher")

}