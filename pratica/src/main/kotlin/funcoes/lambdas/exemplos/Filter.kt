package funcoes.lambdas.exemplos

 data class Aluno(val nome: String, val nota: Double)

fun main(){
    val alunos = arrayListOf(
        Aluno("pedro", 7.4),
        Aluno("Artur", 8.0),
        Aluno("Rafael", 9.4),
        Aluno("Ricardi", 5.4)
    )


    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }

    println(aprovados)
}