package classes.Interface

class Documento(
    override var nome: String,
    override var tipo: String) :IImprimivel {

    override fun imprimir() {
        println("Eu sou um $nome, $tipo")
    }
}