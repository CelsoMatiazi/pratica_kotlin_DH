package funcoes.collection.DH.SaveTheRoupaSA


//1. Criar a classe Peça, que contenha as variáveis marca e modelo, ambas de tipo String
//e um método abstrato chamado retirada.

data class Peca(val marca: String, val modelo: String) {
    fun retirada(){}
}