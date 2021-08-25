package classes.caixa_de_supermercado
import java.util.Calendar.*

const val RED = "\u001b[1;31m"
const val GREEN = "\u001b[0;32m"
const val RESET = "\u001B[0m"
const val WHITE_BACK = "\u001b[47m"
const val RESET2 = "\u001b[0m"


fun Any.print() = println(this)

fun cabecalhoDoComprovante(){
    ("$GREEN\n### DH SuperMarket ###$RESET").print()
}

fun dataDaCompra(){
    val data = getInstance()
    (WHITE_BACK + "Data: ${data.get(DATE)}/${data.get(MONTH)}/${data.get(YEAR)}" + RESET2).print()
}

fun imprimeListaDeCompra(carrinho: CarrinhoDeCompra){
    for(i in carrinho.itens){
        ("${i.nome}: R$ ${i.preco}").print()
    }
}

fun adicionaRodape(carinho: CarrinhoDeCompra){
    val somaValores = {total: Double, atual: Double -> total + atual}
    val precoTotal = carinho.itens.map { it.preco }.reduce(somaValores)
    ("${RED}TOTAL:${RESET} R$ $precoTotal").print()
}
