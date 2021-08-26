package funcoes.collection

fun main() {


    val listaDeNumeros = mutableListOf<Int>()

    listaDeNumeros.add(1)
    listaDeNumeros.add(5)
    listaDeNumeros.add(5)
    listaDeNumeros.add(6)
    listaDeNumeros.add(7)
    listaDeNumeros.add(8)
    listaDeNumeros.add(8)
    listaDeNumeros.add(8)

    println(listaDeNumeros.toString().substring(1,listaDeNumeros.toString().length -1 ))
    listaDeNumeros.forEach{ print("$it,")}
}