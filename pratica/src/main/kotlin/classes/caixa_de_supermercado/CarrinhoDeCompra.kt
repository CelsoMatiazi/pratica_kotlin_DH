package classes.caixa_de_supermercado


class CarrinhoDeCompra {

    var itens = ArrayList<Produto>()

    fun adicionaItens(nome: String, preco: Double){
        itens.add(Produto(nome, preco))
    }

}