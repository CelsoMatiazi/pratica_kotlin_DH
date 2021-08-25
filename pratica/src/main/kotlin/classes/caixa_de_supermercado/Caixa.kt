package classes.caixa_de_supermercado

class Caixa {

    fun fechamentoDaConta(
        cabecalho: () -> Unit,
        data: () -> Unit,
        imprime: () -> Unit,
        rodape: () -> Unit)
    {
        cabecalho()
        data()
        imprime()
        rodape()
    }
}