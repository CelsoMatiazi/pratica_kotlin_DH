package classes.Interface

class Contrato(
    override var nome: String,
    override var tipo: String) : Imprimivel {

    override fun imprimir() {
        println("Eu sou um $nome, $tipo")
    }
}