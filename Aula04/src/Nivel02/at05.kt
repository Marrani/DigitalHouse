//2. Faça um Programa que pergunte quanto você ganha por hora e o número de
//horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
//sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
//5% para o sindicato, faça um programa que nos dê:
//salário bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:
//+ Salário Bruto : R$
//- IR (11%) : R$
//- INSS (8%) : R$
//- Sindicato ( 5%) : R$
//= Salário Líquido : R$

fun main(){
    println("Iremos calcular seu salario.....")
    println("Favor informar o valor hora!")

    var valorHora = readLine()!!.toFloat();

    println("Favor informar quantidade de horas trabalhada no mês")

    var horaMes = readLine()!!.toInt();

    var salarioBruto = valorHora * horaMes;

    var inss = (salarioBruto / 100 ) * 8;
    var ir =  (salarioBruto / 100 ) * 11;
    var sindicado = (salarioBruto / 100 ) * 5;

    var salarioLiquido = salarioBruto - inss - ir - sindicado;

    println("Salário Bruto : R$ $salarioBruto");
    println("IR (11%) : R$ $ir");
    println("INSS (8%) : R$ $inss");
    println("Sindicato ( 5%) : R$ $sindicado");
    println("Salário Líquido : R$ $salarioLiquido");



}