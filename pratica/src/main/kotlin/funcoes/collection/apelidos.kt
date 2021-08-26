package funcoes.collection

fun main() {

    val amigos = mapOf<String, List<String>>(
        "João" to listOf<String>("Juan", "El Divo", "Maromba", "Zé Bonitinho"),
        "Miguel" to listOf<String>("Dark Knight", "Bruce Wayne", "Batfleck", "Gengiva"),
        "Maria" to listOf<String>("Ju", "Mary", "Marilene", "Ventania"),
        "Lucas" to listOf<String>("Lukinha", "Jorge", "George", "Kevin Flynn")
    )

    amigos.forEach { println("${it.key} -> " +
            it.value.toString().substring(1, it.value.toString().length -1)) }


    println()

    amigos.forEach{
        print("${it.key} -> ")
        it.value.forEach{ print("$it ")}
        println()
    }

}