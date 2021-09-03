package classes

fun main() {
    var pele = JogadorDeFutebol("Pelé", 100,100,1000,100000)
    var maradona = JogadorDeFutebol("Maradona", 100,50,666,58)

    var treinamento = SessaoDeTreinamento(pele.experiencia).treinarA(pele)
    var treinamento2 = SessaoDeTreinamento(maradona.experiencia).treinarA(maradona)

    pele.status()
    maradona.status()


}