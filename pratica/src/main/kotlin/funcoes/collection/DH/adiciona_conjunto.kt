
//4. Definir e inicializar um novo conjunto vazio. Adicionar os seguintes elementos ao
//conjunto vazio: 1,5,5,6,7,8,8,8. Imprimir o resultado na tela. Qual é a diferença entre este
//exercício e o anterior?


fun main() {

    val listaDeNumeros = mutableSetOf<Int>()

    listaDeNumeros.add(1)
    listaDeNumeros.add(5)
    listaDeNumeros.add(5)
    listaDeNumeros.add(6)
    listaDeNumeros.add(7)
    listaDeNumeros.add(8)
    listaDeNumeros.add(8)
    listaDeNumeros.add(8)

    println(listaDeNumeros)

    //não aceita numeros repetidos


}