package funcoes.collection


//1.Criar um dicionário que represente os primeiros 5 números da “Loteria dosSonhos”,
// junto com seu significado. Para isso, o dicionário deverá ter como chave Int e como
// valor uma String. Crie uma função para printar a lista, chave e valor um ao lado do outro.
// Números da Loteria dos Sonhos:
// 0 → Ovos
// 1 → Água
// 2 → Escopeta
// 3 →  Cavalo
// 4 → Dentista
// 5 → Fogo


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