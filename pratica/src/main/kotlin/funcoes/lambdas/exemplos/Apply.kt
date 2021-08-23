package funcoes.lambdas.exemplos

class Calculadora{
    var resultado = 0

    fun soma(valor1: Int, valor2: Int){
        resultado += valor1 + valor2
    }

    fun add(valor: Int){
        resultado += valor
    }
}

fun main() {

    val calculadora = Calculadora()

    calculadora.apply { soma(2,4) }.apply { add(3) }.apply { println(resultado) }

    calculadora.apply {
        soma(6,7)
        add(8)
        println(resultado)
    }


    //inline function
    with(calculadora){
        soma(7,3)
        add(3)
        println(resultado)
    }
}