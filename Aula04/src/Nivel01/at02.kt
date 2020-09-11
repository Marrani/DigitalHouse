
//2. Faça um Programa que peça dois números e imprima a soma.


fun main (){
    println("Digite o primeiro numero para efetuar a soma");
    var numero01 = readLine()!!.toInt();

    println("Digite o segundo numero para efetuar a soma");
    var numero02 = readLine()!!.toInt();
    var total = numero01 + numero02;

    print(total);

}