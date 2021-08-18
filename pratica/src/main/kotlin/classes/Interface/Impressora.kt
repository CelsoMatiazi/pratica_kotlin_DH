package classes.Interface


// Em seguida crie uma classe chamada Impressora, nesta classe terá uma propriedade chamada
// listaimprimivel, essa propriedade é do tipo mutableListOf, que vai carregar uma lista do
// tipo Imprimivel.

// Crie uma função que pega um Imprimível e adiciona na lista imprimivel, para isso a função
// recebe como parâmetro uma propriedade do tipo Imprimivel, assim conseguirá adicionar esse
// imprimível na lista, através do .add().

//Crie uma função que imprima tudo que está na lista imprimivel,nessa função pode-se utilizar
// do for para percorrer a lista e imprimir todos os aquivos.

class Impressora {

    var listaImprimivel = mutableListOf<Imprimivel>()

    fun adiciona(item: Imprimivel){
        listaImprimivel.addAll(listOf(item))
    }

    fun imprimir(){

        for(imprimivel in listaImprimivel){
            imprimivel.imprimir()
        }
    }

}

