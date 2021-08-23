package funcoes.lambdas.exemplos


class Produto(val nome: String, val preco: Double)


val materialEscolar = listOf(
    Produto("Lapis", 1.99),
    Produto("Caneta", 3.99),
    Produto("Caderno", 31.99),
    Produto("Mochila", 100.99)
)

fun main() {
    println("==========exemplo1==============")
    val alunos = arrayListOf("Pedro", "Tiago", "Jonas")
    alunos.map {it.toUpperCase()}.apply { println(this) }


    println("==========exemplo2==============")
    val somaValores = {total: Double, atual: Double -> total + atual}
    val precoTotal = materialEscolar.map { it.preco }.reduce(somaValores)

    println("O preço medio é R$ ${precoTotal / materialEscolar.size}")

}