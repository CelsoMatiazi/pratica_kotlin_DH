package funcoes.collection

fun main() {

    val loteriaDosSonhos = mapOf<Int, String>(
        0 to "Ovos",
        1 to "Agua",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo",
    )

    loteriaDosSonhos.forEach { println("${it.key} -> ${it.value}") }
}