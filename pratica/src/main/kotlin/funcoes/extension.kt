package funcoes

fun main() {

    println("reretrdf".randomCapitalizedLetter())

    val grade = (0..10).random()
    println(grade.getStudentStatus())

}


//função que é chamada atraves de uma extensao de um tipo especifico
fun String.randomCapitalizedLetter() = this[(0..this.length-1).random()].toUpperCase()


fun Int.getStudentStatus():String{
    println("nota $this")

    return when(this){
        in 0..4 -> "Reprovado"
        in 5..7 -> "Mediano"
        in 8..9 -> "Bom"
        10 -> "Excelente"
        else -> "Indefinido"
    }
}