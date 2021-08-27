package funcoes.collection.DH.SaveTheRoupaSA

fun main() {

    val pecas : MutableMap<Int, List<Peca>> =
        mutableMapOf(
            1 to listOf<Peca>(Peca("Armani", "terno")),
            2 to listOf<Peca>(Peca("Bras", "bermuda")),
            3 to listOf<Peca>(Peca("25deMarço", "muamba")),
        )

    val guardarPecas = GuardaVolumes(pecas, 0)

    guardarPecas.mostrarPecas(3)
    println()
    guardarPecas.mostrarTodasPecas()

    guardarPecas.devolverPecas(2)
    println()
    guardarPecas.mostrarTodasPecas()
    println()
    guardarPecas.guardaPecas(Peca("Citzes", "Relogio"))
    println()
    guardarPecas.mostrarTodasPecas()

}