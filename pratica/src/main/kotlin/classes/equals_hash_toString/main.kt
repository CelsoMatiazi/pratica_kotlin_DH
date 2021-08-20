package classes.equals_hash_toString

fun main() {
    val pessoa1 = Pessoa("Kiko", 123123123)
    val pessoa2 = Pessoa("Bruxa do 71", 123123123)

    println("Pessoa 1 é igual pessoa 2: ${pessoa1 == pessoa2}")
    println(pessoa1.toString())
    println(pessoa1.hashCode())


    println("==================================")
    val coca1 = Coca(3,5.0)
    val coca2 = Coca(3,5.0)

    println(coca1 == coca2)
    println(coca1.toString())
    println(coca1.hashCode())

    println("=============dataClass=====================")

    val pessoaData1 = PessoaDataClass("Jose", 1234)
    val pessoaData2 = PessoaDataClass("Jose", 1234)

    println(pessoaData1 == pessoaData2)

}