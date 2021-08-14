package classes.classe_abstrata

abstract class Funcionario(var registro: String){

    abstract fun trabalhar()
}


interface Salario{
    fun pagarSalario(valor: Double)
}


class FuncionarioDeTI(registro: String): Funcionario(registro), Salario {
    override fun trabalhar() {
        println("Trabalhando com programador")
    }

    override fun pagarSalario(valor: Double) {
        println("Salario pago no valor de R$:$valor")
    }

}

class FuncionarioExecutivo(registro: String): Funcionario(registro), Salario{
    override fun trabalhar() {
        println("Trabalhando como executivo")
    }

    override fun pagarSalario(valor: Double) {
        println("Salario pago no valor de R$:$valor")
    }
}


fun main() {
    val funcionario1 = FuncionarioDeTI("23232432")
    val funcionario2 = FuncionarioExecutivo("23232432")

    funcionario1.trabalhar()
    funcionario1.pagarSalario(345.654)
    println()
    funcionario2.trabalhar()
    funcionario2.pagarSalario(8384857.56)
}

