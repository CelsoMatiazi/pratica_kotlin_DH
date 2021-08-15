package classes.classeABS_ingresso

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    println("Escolha o tipo de ingresso deseja adquirir:")
    println(
        """
        1 - Padrão
        2 - Vip
    """.trimIndent()
    )

    var retornoInicial = scanner.nextInt()

    if (retornoInicial == 1) {
        var ingresso = IngressoPadrao(100.0)
        ingresso.imprimeValor()
    } else {
        var ingresso = IngressoVip(20.0, 100.0)
        ingresso.imprimeValor()
    }
}