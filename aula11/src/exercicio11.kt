fun main(){
    var pessoa01 = Pessoa("Gabriel",225533)
    var pessoa02 = Pessoa("Gabriel", 225533)

    var coca01 = Coca(2, 5.0)
    var coca02 = Coca(2, 10.0)

    var alunos = arrayListOf<Aluno>()
    var aluno01 = Aluno("Gabriel", 123)
    var aluno02 = Aluno("Henrique", 123)
    var aluno03 = Aluno("Marrani", 123)
    var aluno04 = Aluno("Nunes", 123)
    var aluno05 = Aluno("Segantini", 123)

    alunos.add(aluno02)
    alunos.add(aluno02)
    alunos.add(aluno03)
    alunos.add(aluno04)

    var funcionarios = arrayListOf<Funcionario>()
    var funcionario01 = Funcionario("Marrani", 2233)
    var funcionario02 = Funcionario("Segantini", 12345)
    var funcionario03 = Funcionario("Nunes", 33254)
    var funcionario04 = Funcionario("Gabriel", 523)
    var funcionario05 = Funcionario("Henrique", 2233)

    funcionarios.add(funcionario01)
    funcionarios.add(funcionario02)
    funcionarios.add(funcionario03)
    funcionarios.add(funcionario04)

    funcionarios.contains(funcionario05)

    println(pessoa01 == pessoa02)

    println(coca01 == coca02)

   println(alunos.contains(aluno05))
}