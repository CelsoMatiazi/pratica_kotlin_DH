package classes.equals_hash_toString

fun main() {
    val pessoa1 = Pessoa("Kiko", 123123123)
    val pessoa2 = Pessoa("Bruxa do 71", 123123123)

    println("Pessoa 1 é igual a pessoa 2: ${pessoa1 == pessoa2}")
    println(pessoa1.toString())
    println(pessoa1.hashCode())

}