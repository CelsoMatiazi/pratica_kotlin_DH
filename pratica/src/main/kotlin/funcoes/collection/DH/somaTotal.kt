package funcoes.collection.DH


//5. Crie a funçãosomaTotal(Set<Int>),a função deve percorrer o conjunto de inteiros, ir
//acumulando o total da soma dos valores e, no final, imprimir na tela o valor da soma
//total.



fun main() {
     val lista = setOf<Int>(1,2,3,4)
     somaTotal(lista)
}

fun somaTotal(listaNumeros: Set<Int>){
    println(listaNumeros.sum())
}