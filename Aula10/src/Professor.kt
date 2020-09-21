class Professor(nome: String, registro: String):Pessoa(nome, registro) {

    override val podeFazerChamada: Boolean
        get() = true

    override val podeDarAula: Boolean
        get() = true

}