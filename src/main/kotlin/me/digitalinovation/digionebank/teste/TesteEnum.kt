package me.digitalinovation.digionebank.teste

import me.digitalinovation.digionebank.ClienteTypo



    fun main() {
        ClienteTypo.values().forEach { elemento ->
            println("${elemento.name} - ${elemento.descricao}")
        }
        ClienteTypo.values().forEach {
            println("${it.name} - ${it.descricao}")
        }

        val pf = ClienteTypo.PF
        println(">>${pf.name} - ${pf.descricao}")

        val pj = ClienteTypo.PJ
        println(">>${pj.name} - ${pj.descricao}")
    }
