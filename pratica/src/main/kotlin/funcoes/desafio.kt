package funcoes

fun main() {

    println("Digite um numero:")
    val i: Int = (readLine() ?: return).toInt()

    for(n in 1..i){
        println("$n ${n*n} ${n*n*n}")
        println("$n ${(n*n)+1} ${(n*n*n)+1}")
    }
}