package com.betrybe.aula02


fun main() {
    // Ex 1
    print("Calcular Aumento: ")
    println(calcularAumento(1000.00))

    // Ex 2
    print("Calcular Altura: ")
    println(calcularAltura(0.1, 1.00))

    // Ex 3
    println("Mostrar Maior: ")
    println(mostrarMaior(1, 2))
    println(mostrarMaior(4, 3))
    println(mostrarMaior(5, 5))

    // Ex 4
    println("Calcular aprovação: ")
    println(calcularAprovacao(2.0, 3.0, 4.0))
    println(calcularAprovacao(1.0, 2.0, 3.0))
    println(calcularAprovacao(7.0, 7.0, 7.0))

}

/*
Exercício 1
Escreva um programa usando Kotlin que receba o salário de uma pessoa colaboradora,
calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%
*/
fun calcularAumento(salario: Double) = salario * 1.25

/*
Exercício 2
Cada degrau de uma escada tem X de altura. Escreva um programa usando Kotlin que
receba essa altura e a altura que uma pessoa deseja alcançar usando a escada,
calcule e mostro quantos degraus ela deverá subir para atingir seu objetivo,
sem se preocupar com a altura da pessoa. Todas as medidas fornecidas devem estar em metros.
*/

fun calcularAltura(alturaDegrau: Double, alturaDesejada: Double): Int {
    var quantidadeDegraus = 0
    while (alturaDegrau * quantidadeDegraus < alturaDesejada) {
        quantidadeDegraus++
    }
    return quantidadeDegraus
}


/*
Exercício 3
Escrevas um programa em Kotlin que receba dois números e mostre o maior.
*/

fun mostrarMaior(first: Int, second: Int): Int? {
    return when {
        first > second -> first
        first < second -> second
        else -> null
    }
}

/*
Exercício 4
Escrevas um programa em Kotlin que receba três notas de uma pessoa estudante
e mostre a média aritmética e a mensagem conforme as regras a seguir:

Média aritmética igual ou maior que 0,0 e menor do que 3,0, exibir a mensagem REPROVADO
Média aritmética igual ou maior que 3,0 e menor do que 7,0, exibir a mensagem EXAME
Média aritmética igual ou maior que 7,0 e menor do que 10,0, exibir a mensagem APROVADO
 */

fun calcularAprovacao(nota1: Double, nota2: Double, nota3: Double): String {
    val total = (nota1 + nota2 + nota3) / 3

    return when {
        total < 3.0 -> "REPROVADO"
        total < 7.0 -> "EXAME"
        total >= 7.0 -> "APROVADO"
        else -> "Nota inválida"
    }
}



