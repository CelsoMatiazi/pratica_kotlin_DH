package classes

class JogadorDeFutebol(
    val nome :String,
    var energia: Int = 0,
    var alegria :Int = 0,
    var gols: Int = 0,
    var experiencia: Int = 0 ){


    fun fazerGols(){
        energia -= 5
        alegria += 10
        gols += 1
        println("GOOOOOOOL! do $nome")
    }

    fun correr(){
        energia -= 10
        println("Cansei")
    }


    fun status(){
        println("""
            Jogador: $nome
            Energia: $energia
            Alegria: $alegria
            Gols:    $gols
            Experiencia: $experiencia
        """.trimIndent())
    }
}


class SessaoDeTreinamento(var experiencia :Int, ){

    fun treinarA(jogadorDeFutebol: JogadorDeFutebol){
        println("Experiencia Inicial: $experiencia")
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGols()
        jogadorDeFutebol.correr()
        experiencia++
        println("Experiencia Inicial: $experiencia")
    }
}