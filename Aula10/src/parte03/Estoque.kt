package parte03

import java.lang.Exception

class Estoque(var nome:String,
              var qtdAtual:Int,
              var qtdMinima:Int) {

    fun mudarNome(nome: String){
        this.nome = nome

    }

    fun mudarQtdMinima(qtd:Int){
        if(qtdAtual - qtd < 0){
            throw Exception("Quantidade não pode ser negativa")
        }
        this.qtdMinima = qtd
    }

    fun repor(qtd: Int){
        this.qtdAtual += qtd
    }

    fun darBaixa(qtd: Int){
        if(qtdAtual - qtd < 0){
            throw Exception("Quantidade não pode ser negativa")
        }
        this.qtdAtual-= qtd
    }

    fun mostrar():String{
        return("Produto: $nome\nQuantidade minima: $qtdMinima\nQuantidade atual: $qtdAtual")
    }

    fun precisaRepor():Boolean{
        return qtdAtual <= qtdMinima

    }



}