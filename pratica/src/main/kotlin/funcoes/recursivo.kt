package funcoes

fun main() {
    val aluno = Aluno()
    aluno.numero = 12
}


class Aluno(){
    var numero = 0

//  ERRADO - gera recursividade
//  set(value){
//    numero = value //problema loop
//  }

//  Correto - atribui field ao atributo numero
    set(value){
        field = value
    }
}