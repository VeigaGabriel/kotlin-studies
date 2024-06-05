package com.betrybe.aula01

/*
Escrever um programa que receba três números inteiros,
calcule e mostre a média aritimética simples entre os números
*/

fun main() {

    val numberOrder: Array<String> = arrayOf("primeiro", "segundo", "terceiro", "quarto")
    var numberArray: Array<Double> = arrayOf()

    for (item in numberOrder) {
        print("Digite o $item número:")
        numberArray += readln().toDouble()
    }

    println("Lista de números: ${numberArray.joinToString()}")
    println("Média: ${calcularMedia(numberArray)}")
}

//fun calcularMedia(numbers: Array<Int>): Int {
//    val sum: Int = numbers.reduce { acc, num -> acc + num }
//    return sum / numbers.size
//}

fun calcularMedia(numbers: Array<Double>) = numbers.reduce { acc, num -> acc + num } / numbers.size