package Nivel02
fun main () {
    val sistemasOperacional = arrayListOf<String>("Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outros")
    var votos = arrayListOf<Int>( 0, 0, 0, 0, 0, 0)
    var totalDeVotos = 0.0


    do{
        println("")
        println("Qual o melhor sistema operacional para uso em servidores?")
        println("")
        println("As possíveis opções são:")
        println("====================")

        for (i in 0 until sistemasOperacional.size){
            println("${i + 1} = ${sistemasOperacional[i]}")
        }
        println("0 = Encerrar pesquisa")
        println("====================")
        print("Reposta: ")

        var resposta = readLine()!!.toInt()

        if (resposta in 1..6){
            votos[resposta - 1] += 1
            totalDeVotos++
        } else if (resposta == 0){
            break
        } else {
            println("resposta inválida")
        }


    }while (true)

    println("Sistema Operacional     Votos       %")
    println("-------------------     -----     -----")
    println("Windows Server          ${votos[0]}         ${"%.2f".format((votos[0]/totalDeVotos) * 100)}")
    println("Unix                    ${votos[1]}         ${"%.2f".format((votos[1]/totalDeVotos) * 100)}")
    println("Linux                   ${votos[2]}         ${"%.2f".format((votos[2]/totalDeVotos) * 100)}")
    println("Netware                 ${votos[3]}         ${"%.2f".format((votos[3]/totalDeVotos) * 100)}")
    println("Mac OS                  ${votos[4]}         ${"%.2f".format((votos[4]/totalDeVotos) * 100)}")
    println("Outros                  ${votos[5]}         ${"%.2f".format((votos[5]/totalDeVotos) * 100)}")
    println("-------------------     -----     -----")
    println("Total:                  ${totalDeVotos.toInt()}")
    println("")

    for (i in 0 until sistemasOperacional.size){
        if (votos.max() == votos[i]){
            println("O Sitema operacional mais votado foi ${sistemasOperacional[i]}, com ${votos[i]} votos.")
            println("Correspondendo a ${"%.2f".format((votos[i]/totalDeVotos) * 100)}% dos votos")
            break
        }
    }
    println("")
}