package funcoes.lambdas

//1-Crie 4 funções lambdas para as operações de matemática básica: soma, subtração,
// multiplicação e divisão. Cada lambda receberá2 parâmetros para realizar as operações.
// Crie uma função Main e execute-as, printando os resultados
val soma: (Int, Int) -> Int = {a: Int, b: Int ->  a + b}
val soma2 = {a: Int, b: Int ->  a + b}
val subtracao = {a: Int, b: Int ->  a - b}
val divisao = {a: Int, b: Int ->  if(b != 0) a / b else 0}
val multiplicacao = {a: Int, b: Int ->  a * b}

// outra forma
class Calculadora{
    fun calcular(a: Int, b: Int, operacao : (Int, Int) -> Int){
        println(operacao(a,b))
    }
}

//2-Crie uma função lambda que receba um e-mail e valide-o para saber se
// está conforme as regras básicas. Para cumprir a regra básica principal,
// o mesmo deve conter um @. OBS. essa função deve retornar true ou false, ok? =)
// Execute-o na função Main, printando o resultado.
val validaEmail : (String) -> Boolean = {email: String ->
    email.contains("@") && email.contains(".")
}

// versão Ana Cortez
//val emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
//val isEmailValid = {email:String -> emailRegex.toRegex().matches(email)}


//3-Cria uma função lambda que receba uma List<Int> e calcule e retorne o produto
// dos itens contidos na mesma. Execute-o na função Main, printando o resultado.
val produto = {lista: List<Int> ->
    var prod = 1
    for (item in lista){
        prod *= item
    }
    prod
}

val produto2 = {lista: List<Int> ->
    var prod = 1
    lista.map{prod *= it}
    prod
}

val produto3 = {lista: List<Int> ->
    var prod = 1
    lista.forEach{prod *= it}
    prod
}


fun main() {
    println("Exercicio 1")
    println("Soma = " + soma(3,4))
    println("Soma2 = " + soma2(12,4))
    println("Subtracao = " + subtracao(3,4))
    println("Divisao = " + divisao(3,4))
    println("Multiplicacao = " + multiplicacao(3,4))

    println("")
    println("passando operação por paramentro para a classe Calculadora")
    Calculadora().calcular(3,4, subtracao)

    println("")
    println("Exercicio 2")
    println("Email valido = " + validaEmail("celsomatiazi@gmail.com"))

    println("")
    println("Exercicio 3")
    println("Produto = " + produto(listOf(1,2,3,4)))
    println("Produto2 = " + produto2(listOf(1,2,3,4)))
    println("Produto3 = " + produto3(listOf(1,2,3,4)))
}