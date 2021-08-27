package funcoes.collection.DH.SaveTheRoupaSA


//2.Criar a classe GuardaVolumes, que tenha como atributoum dicionário e um contador
//que será utilizado como identificador. As chaves do dicionário serão Integer e, como
//valor, haverá uma lista de peças

class GuardaVolumes(
    var dicionario: MutableMap<Int, List<Peca>>,
    var contador: Int) {

//    3. Criar a função guardarPecas(MutableList<Peca>)na classe GuardaVolumes, que
//    recebe uma lista de peças adiciona essa lista de peçasem nosso dicionário e retorna o
//    número de identificação, ou seja, a chave do dicionário onde guardamos as peças, que
//    neste caso é o nosso contador.

    fun guardaPecas(pecas: Peca): Int{
        dicionario.put(contador++, listOf(pecas))
        return contador
    }

//    4.Criar o método mostrarPecas()na Classe GuardaVolumes,que imprime na tela todas
//    as peças que estão no guarda-volumes, junto com onúmero correspondente.

    fun mostrarTodasPecas(){
        dicionario.forEach { println(it) }
    }

//    5.Criar o método mostrarPecas(numero: Int) na Classe GuardaVolumes, que imprima
//    as peças que estão associadas ao número recebido

    fun mostrarPecas(id: Int){
        println(dicionario[id])
    }

//    6.Criar o método devolverPecas(numero: Int)na ClasseGuardaVolumes, que remova a
//    lista de peças que esta associada ao número recebido.
    fun devolverPecas(id: Int){
        dicionario.remove(id)
    }
}