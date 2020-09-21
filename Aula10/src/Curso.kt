class Curso(val nome:String, val professor: Professor) {

    val aulas  get() = ArrayList<Aula>()
    val aluno get() = ArrayList<Aluno>()
}