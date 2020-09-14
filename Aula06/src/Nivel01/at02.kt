package Nivel01

fun main (){
    val altura = ArrayList<Float>()

    for( i in 1..10){
        print("Digite uma altura:")
        altura.add(readLine()!!.toFloat())


    }
    altura.reverse()
    print(altura)

}