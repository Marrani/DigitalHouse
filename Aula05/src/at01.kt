fun main(){
    println("Digite seu sexo F para Feminino e M para masculino")
    when(readLine()!!.toUpperCase()){
      "F" -> println("Feminino")
      "M" -> println("Masculino")
      else -> println("Sexo Inválido")
  }

}

