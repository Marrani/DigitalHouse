package excercício03


fun main(){
    var atleta = Atleta("Gabriel", 9, 9)

    var atleta01 = Atleta("Henrique", 8, 6)

    var atleta02 = Atleta("Marrani", 10, 10)

    var prova = Prova(10,8)

    var prova01 = Prova(7,5)

    var prova02 = Prova(10,5)

    println(prova.podeRealizar(atleta))
    println(prova01.podeRealizar(atleta01))
    println(prova02.podeRealizar(atleta02))
}

