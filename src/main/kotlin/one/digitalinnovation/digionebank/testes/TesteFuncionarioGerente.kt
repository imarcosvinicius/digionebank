package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val vitor = Gerente("Vitor Bueno", "123.456.789-11", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(vitor)

    TesteAutenticacao().autentica(vitor)
}

