package classes

class Aluno(var nome: String, var idade: Int) { //construtor primario

    var sobrenome: String = " "

    //construtor secundario
    constructor(nome: String, idade: Int, sobrenome: String): this(nome, idade){
        this.sobrenome = sobrenome
    }
}