package classes.Interface


//Agora crie três classes, elas serão nossos documentos,cada um deles precisará implementar a
// interface Imprimível, sobrescrevendo suas propriedades e funções.
// Mas cada documento deve saber se imprimir: Seguindo o padrão:
// “Eu sou $tipoDeDocumento, $nome”
// ** Utilizando Strings templates para preparar a impressão

// FOTO -> Na função deve printar: Eu sou uma foto, selfie
// DOCUMENTO -> Na função deve printar: Eu sou um documento, RG
// CONTRATO -> Na função deve printar: Eu sou um contrato, contrato de trabalho

class Foto(
    override var nome: String,
    override var tipo: String) :IImprimivel {

    override fun imprimir() {
        println("Eu sou uma $nome, $tipo")
    }
}