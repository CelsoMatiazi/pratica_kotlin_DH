package funcoes.lambdas

fun main() {
    val nomes = arrayListOf("Ze do caixao", "Egberto Gismonti", "Paco de Lucia", "Pat Metheny")
    val ordenados = nomes.sortedBy { it }

    println(ordenados)
    println(ordenados.reversed())
}