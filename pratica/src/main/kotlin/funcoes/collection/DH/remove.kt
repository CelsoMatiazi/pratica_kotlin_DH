package funcoes.collection.DH

class Item(var nome: String,var valor: Int,  var cod: Int,)

fun main() {

    var sacola = mutableListOf<Item>()

    sacola.add(Item("Lapis", 1, 111))
    sacola.add(Item("Caneta", 2, 222))
    sacola.add(Item("Borracha", 1, 333))
    sacola.add(Item("Regua", 4, 444))


    sacola.forEach { println(it.nome) }

    println()

    for(item in sacola){
        if(item.cod == 333){
            sacola.remove(item)
        }
    }

    sacola.forEach { println(it.nome) }


}