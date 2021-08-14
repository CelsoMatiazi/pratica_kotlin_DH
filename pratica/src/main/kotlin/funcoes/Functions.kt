fun main(){
    //print(soma(2,3))
    //print( maiorDeTres(34,765,156))
    //print(comparaTextos("aa", "aa"))
    //print(retornaPar(2))
    //imprimeImpares()
    //print(comparaQuatroNumeros(23,15,13,9))
    //imprimePositivos()
    //imprimeImparPositivoComRange(100, 10)
    print(stringSize("HelllllloooooooWorlddddddddddddddd"))
}


// Função que recebe 2 numeros e retorna a soma entre eles
fun soma(numero1: Int, numero2: Int) : Int{
    return numero1 + numero2
}


// Função que recebe 3 numeros e retorno o maior dos 3
fun maiorDeTres(numero1: Int, numero2 : Int, numero3: Int): Int{
    return if(numero1 > numero2 && numero1 > numero3){
        numero1
    }else if(numero2 > numero1 && numero2 > numero3){
        numero2
    }else{
        numero3
    }
}


//Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes,
// retornar true, ou, caso sejam iguais, retornar false.
fun comparaTextos(txt1 : String, txt2 : String): Boolean {
    return txt1 != txt2
}

//Escrever o código que deve analisar um número inteiro e, caso ele seja par,retornar true,
//caso contrário, retorna false.
fun retornaPar(num : Int): Boolean {
    return num % 2 == 0
}

//Escrever um programa que imprima na tela os primeiros 100 números inteiros
// positivos ímpares.
fun imprimeImpares(){
    for(num in 0..200){
        if(num %2 != 0){
            println(num)
        }
    }
}

fun imprimeImparPositivoComRange(numInicial: Int, quant :Int){
   var numerosImpares :Int = 0
   var numInicio :Int = numInicial

   while(numerosImpares < quant){
       if(numInicio % 2 != 0 && numInicio > 0){
           println(numInicio)
           numerosImpares++
       }
       numInicio++
   }
}



//Escrever um código que deve analisar quatro números inteiros e,
// caso numA seja maior que numC e numD ou caso numB seja maior que numC e numD,
// retornar true, caso contrário, retornar false.
fun comparaQuatroNumeros(numA :Int, numB : Int, numC: Int, numD : Int): Boolean {
    return (numA > numC && numA > numD) || (numB > numC && numB > numD)
}


//Escrever um programa que exiba os primeiros 100 números positivos.
fun imprimePositivos(){
    for(num in 0..200){
        if(num % 2 == 0){
            println(num)
        }
    }
}


//Retornar o numero de letras em uma palavra
fun stringSize(txt :String):Int{
    return txt.length
}