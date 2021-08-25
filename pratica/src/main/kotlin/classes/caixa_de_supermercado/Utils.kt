package classes.caixa_de_supermercado
import java.util.*
import java.util.Calendar.*

const val RED = "\u001b[1;31m"
const val GREEN = "\u001b[0;32m"
const val RESET = "\u001B[0m"


fun cabecalhoDoComprovante(){
    println("$GREEN### DH SuperMarket ###$RESET")
}

fun dataDaCompra(){
    val data = Calendar.getInstance()
    println("Data: ${data.get(DATE)}/${data.get(MONTH)}/${data.get(YEAR)}")
}

fun imprimeListaDeCompra(carrinho: CarrinhoDeCompra){
    for(i in carrinho.itens){
        println("${i.nome}: R$ ${i.preco}")
    }
}

fun adicionaRodape(carinho: CarrinhoDeCompra){
    val somaValores = {total: Double, atual: Double -> total + atual}
    val precoTotal = carinho.itens.map { it.preco }.reduce(somaValores)
    println("${RED}TOTAL:${RESET} R$ $precoTotal")
}
