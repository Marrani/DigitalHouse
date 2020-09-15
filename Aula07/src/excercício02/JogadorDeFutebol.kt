package excercício02

class JogadorDeFutebol(nome:String, energia:Int, alegria:Int, gols:Int, experiencia:Int ) {
    var nome:String = ""
   var energia:Int = 0
   var alegria:Int = 0
    var gols:Int = 0
    var experiencia:Int = 0

    fun fazerGol() {

        energia -= 5
        alegria += 10
        gols+= 1
        println("GOOOOL!")


    }

    fun correr(){
        energia-= 10
        println("Cansei")
    }


}



