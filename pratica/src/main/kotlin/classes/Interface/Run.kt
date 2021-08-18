package classes.Interface


// Por fim crie um arquivo kotlin que contenha a função Main, dentro dela crie um objeto de cada
// classe, sendo Documento, Foto, Contrato e Impressora. Agora utilizando a impressora adicione
// cada documento na impressão e imprima todos.

fun main() {

    val documento = Documento("Documento", "Passaporte")
    val foto = Foto("Foto", "Passaporte")
    val contrato = Contrato("Contrato", "Locação")
    val impressora = Impressora()

    impressora.adiciona(documento)
    impressora.adiciona(foto)
    impressora.adiciona(contrato)
    impressora.imprimir()

}