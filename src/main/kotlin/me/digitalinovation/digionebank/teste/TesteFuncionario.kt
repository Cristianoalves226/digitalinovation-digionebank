package me.digitalinovation.digionebank.teste

import me.digitalinovation.digionebank.Gerente
import me.digitalinovation.digionebank.ImprimeRelatorioFuncionario

fun main() {
    val joao = Gerente("Joao", "123", 1200.0,"senha123")
    ImprimeRelatorioFuncionario.imprime(joao)

    TesteAutenticacao().autentica(joao)
}