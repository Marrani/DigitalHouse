import java.sql.DriverManager.println

open abstract class ContaBancaria (var numeroConta:Int, protected var saldo:Double) :Imprimivel{
   abstract fun sacar(valor:Double):Boolean

   abstract fun depositar(valor:Double):Boolean

override fun mostrarDados(){
   println("Conta: $numeroConta")
   println("Saldo: $saldo")
}

   open fun transferir(valor: Double, destino: ContaBancaria) {
      val saldoContaOrigem = saldo
      if (!sacar(valor) || !destino.depositar(valor)){
         saldo = saldoContaOrigem
         kotlin.io.println("Operação cancelada.")
      }
   }


}