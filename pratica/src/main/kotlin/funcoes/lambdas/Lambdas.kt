package funcoes

fun main() {

    val soma: (Int, Int) -> Int = {n1: Int , n2: Int -> n1 + n2}
    println(soma(10,5))

    val somaSimples: (Int, Int) -> Int = {n1, n2 -> n1 + n2}
    println(somaSimples(10,23))

    val somaMaisSimples = {n1: Int, n2: Int -> n1 + n2}
    println(somaMaisSimples(10,5))

    val somaComretornoUnit: (Int, Int) -> Unit = {n1: Int, n2: Int -> println(n1 + n2)}
    somaComretornoUnit(34, 54)

    val concatenaStrings: (String, String) -> String = {a: String, b: String -> a + b}
    println(concatenaStrings("são","Paulo").uppercase())


    val somaComUnicoParametro: (Int) -> Unit = { println(it + 10) } // it referencia o paramentro
    somaComUnicoParametro(11)

    val validaEmail: (String) -> Boolean = { email -> email.contains("@")}
    println(validaEmail("celso@gmail.com"))


    val validaEmailEPrinta = { email: String ->
       var emailValidado =  email.contains("@")
        println(emailValidado)
        emailValidado //sempre retorna o ultimo item
    }

    validaEmailEPrinta("celsoGmail.com")


    val listaDePares: (List<Int>) -> Unit = {
        for(item in it){
            if(item %2 == 0){
                print(item)
            }
        }
    }
    listaDePares(listOf(1,2,3,4,5,6,7,8,9,10))


    //passando função por paramentro
    somatoria(10,20, somaMaisSimples)


}

fun somatoria(a: Int, b: Int, calculador: (Int, Int) -> Int ){
    println(calculador(a,b))
}