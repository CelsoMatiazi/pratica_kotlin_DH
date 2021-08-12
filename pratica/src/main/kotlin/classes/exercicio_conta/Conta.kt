package classes.exercicio_conta

import classes.Cliente

class Conta(var numeroDaconta : Int, var saldo :Int, var titular : Cliente){


    fun deposito(quantiaDeDinheiro :Int){
        saldo += quantiaDeDinheiro
        println("Deposito - Saldo: $saldo")
    }

    fun saque(quantiaDeDinheiro :Int){
        if(quantiaDeDinheiro > saldo){
            exibirMensagem()
            print("Saldo insuficiente")
        }else{
            saldo -= quantiaDeDinheiro
            println("transação Realizada - Saldo $saldo")
        }
    }

    private fun exibirMensagem(){
        println("Operação não realizada!")
    }
}