package classes.exercicio_conta

import classes.Cliente

fun main() {
    var cliente1 = Cliente("Romoaldo", "FullStack")
    var cliente2 = Cliente("Romildo", "Pascal")

    var conta1 = Conta(1234, 0, cliente1)
    var conta2 = Conta(2345, 0, cliente2)

    conta1.deposito(100)
    conta2.saque(100)
}