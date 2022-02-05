package me.digitalinovation.digionebank.teste

import me.digitalinovation.digionebank.Analista
import me.digitalinovation.digionebank.Funcionario
import me.digitalinovation.digionebank.ImprimeRelatorioFuncionario

fun main() {
    val joao = Analista("Joao", "123", 1200.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}