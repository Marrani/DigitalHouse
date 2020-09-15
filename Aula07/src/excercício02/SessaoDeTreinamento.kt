package excercício02

class SessaoDeTreinamento (var experiencia:Int) {

    // var jogador = JogadorDeFutebol("Gabriel", 10, 15,0,0)

    fun treinar(jogador: JogadorDeFutebol) {

        jogador.correr()
        jogador.fazerGol()
        println("Experiência anterior: ${jogador.experiencia}")
        jogador.experiencia += experiencia
        println("Experiência atual ${jogador.experiencia}")


    }

}


