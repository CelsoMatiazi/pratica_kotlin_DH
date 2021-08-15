package classes.classeABS_ingresso

class IngressoVip(valor: Double, var valorAdicional: Double) : Ingresso(valor) {

    override fun imprimeValor() {
        println("Ingresso Vip R$:${valor + valorAdicional}")
    }
}