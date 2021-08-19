package classes.equals_hash_toString

class Coca(var tamanho: Int, var preco: Double)  {

    override fun equals(other: Any?): Boolean {
        return (other is Coca && other.tamanho == this.tamanho)
    }

    override fun toString(): String{
        return "tamanho ${this.tamanho} e preço ${this.preco}"
    }

    override  fun hashCode(): Int{
        return this.tamanho
    }
}