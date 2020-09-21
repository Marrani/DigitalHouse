abstract class Pessoa(var nome:String, var registro:String) {

    open val podeAssistirAula:Boolean
        get() = false


    open val podeFazerLicao:Boolean
        get() = false

   open val podeDarAula: Boolean
        get() = false

    open val podeFazerChamada: Boolean
        get() = false
}