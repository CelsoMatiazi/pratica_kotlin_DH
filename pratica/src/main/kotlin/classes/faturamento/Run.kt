package classes.faturamento

fun main() {

    var itens = listOf<Item>(
        Item(9878, "Copo", 4, 66.89),
        Item(34234, "Colher", 7, 96.89),
        Item(345634, "Faca", 5, 36.89),
        Item(3213, "papel", 5, -36.89),
    )

    val fatura = Fatura(itens)
    val resultado = fatura.totalDaFatura()

    itens.map { item ->
        println(
             "Codigo: ${item.numeroDoItem}, " +
             "Produto: ${item.descricao}, " +
             "Quantidade: ${item.quantidade}, " +
             "Valor: ${item.preco}"
        )
    }
    println("=========================================================")
    println("O total faturado é de R\$:$resultado")
}