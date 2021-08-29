package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jim Carrey"
    var cpf: String = "123.456.789-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val pessoaDados = Pessoa()

    println(pessoaDados.pessoaInfo())
}