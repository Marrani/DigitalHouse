class Funcionario(var nome:String, var numeroRegistro:Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Funcionario

        if (numeroRegistro != other.numeroRegistro) return false

        return true
    }

    override fun hashCode(): Int {
        return numeroRegistro
    }
}