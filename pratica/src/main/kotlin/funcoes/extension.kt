package funcoes

fun main() {

    print("reretrdf".randomCapitalizedLetter())

}


//função que é chamada atraves de uma extensao de um tipo especifico
fun String.randomCapitalizedLetter() = this[(0..this.length-1).random()].toUpperCase()