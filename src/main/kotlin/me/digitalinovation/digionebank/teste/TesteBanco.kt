package me.digitalinovation.digionebank.teste

import me.digitalinovation.digionebank.Banco


fun main() {
    val digione = Banco("Digionebank", 123)
    println(digione.nome)
    println(digione.numero)
    println(digione.info())

    val banco2 = digione.copy("Banco2")

    println(banco2.nome)
    println(banco2.numero)
    println(banco2.info())
}
