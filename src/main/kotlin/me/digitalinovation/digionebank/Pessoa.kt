package me.digitalinovation.digionebank

class Pessoa {
    var nome: String = "Cristiano"
    var cpf: String = "123.123.123-12"


}

fun main() {
    val cristiano = Pessoa()
    cristiano.cpf = "1234"
    println(cristiano)
    println(cristiano.nome)
    println(cristiano.cpf)
}
