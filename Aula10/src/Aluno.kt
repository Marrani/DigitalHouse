class Aluno(var sobrenome:String, nome: String, registro: String): Pessoa(nome, registro) {

    override val podeAssistirAula: Boolean
        get() = true

    override val podeFazerLicao: Boolean
        get() = true
}