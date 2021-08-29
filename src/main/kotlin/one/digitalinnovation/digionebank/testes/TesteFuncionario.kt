package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val pessoaDados = Pessoa(nome = "Jim Carrey", cpf = "123.456.789-11")
    println(pessoaDados.nome)
    println(pessoaDados.cpf)

    val joao = Funcionario("Joao Batista", "123.456.789-11", BigDecimal(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}