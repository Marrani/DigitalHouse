class Banco : Imprimivel{

    var contaBancaria = arrayListOf<ContaBancaria>()

    fun inserir(contaBancaria: ContaBancaria){

        this.contaBancaria.add(contaBancaria)

    }

    fun remover(contaBancaria: ContaBancaria){

        this.contaBancaria.remove(contaBancaria)

    }

    fun procurarConta(numeroConta:Int): ContaBancaria?{

        for (conta in this.contaBancaria) {
            if (conta.numeroConta == numeroConta) {
                return conta
            }
        }
        println("Conta inexistente.")
        return null
    }
        }

