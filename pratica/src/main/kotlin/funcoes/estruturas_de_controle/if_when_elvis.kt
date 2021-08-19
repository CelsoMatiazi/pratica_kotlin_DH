package funcoes.estruturas_de_controle

fun main() {

}


fun estruturaIf(){
    if(1 > 2){
        //bloco de codigo
    }else if(1 == 1){
        //bloco de codigo
    }else{
        //bloco de codigo
    }
}


fun estruturaWhen(){
    var case1 = 0

    when(case1){
        4 -> {}
        5 -> {}
        7 -> {}
        else -> {}
    }
}

fun estruturaElvis(){
    val a: Int? = null
    var number = a ?: 0 //valida se o valor é nulo e atribui um valor
}