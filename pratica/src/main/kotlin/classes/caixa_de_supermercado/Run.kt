package classes.caixa_de_supermercado

fun main() {

    val carrinho = CarrinhoDeCompra()

    carrinho.adicionaItens("Walkman", 234.99)
    carrinho.adicionaItens("Fita K7 5150", 19.99)
    carrinho.adicionaItens("LP Jazz", 14.99)
    carrinho.adicionaItens("Boné", 10.00)
    carrinho.adicionaItens("BMX", 550.99)
    carrinho.adicionaItens("Pentium 100", 4550.0)
    carrinho.adicionaItens("Fita Atari", 45.0)
    carrinho.adicionaItens("Hiphone", 666.50)

    Caixa().fechamentoDaConta(
        cabecalho = { cabecalhoDoComprovante() },
        data = { dataDaCompra() },
        imprime = { imprimeListaDeCompra(carrinho) },
        rodape = { adicionaRodape(carrinho) }
    )
}