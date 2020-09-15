package excercício02

fun main(){
    var jogador01 = JogadorDeFutebol("Gabriel", 10, 15,0,0)
    var jogador02 = JogadorDeFutebol("Henrique", 10, 15,0,0)
    var treinamento = SessaoDeTreinamento(10)
    treinamento.treinar(jogador01)
    treinamento.treinar(jogador02)
}


