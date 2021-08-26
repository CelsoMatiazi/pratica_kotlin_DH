


//3. Definir e inicializar uma nova lista vazia. Adicionar os seguintes elementos à lista vazia:
// 1,5,5,6,7,8,8,8. Imprimir o resultado na tela.

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
    println()
    listaDeNumeros.forEach{ print("$it, ")}
}