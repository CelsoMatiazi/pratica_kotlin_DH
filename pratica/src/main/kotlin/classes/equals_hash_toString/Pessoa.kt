package classes.equals_hash_toString

class Pessoa(var nome: String, var rg: Int) {

    override fun equals(other: Any?): Boolean {
         return (other is Pessoa && other.rg == this.rg)
    }

    override fun toString(): String{
        return "${this.nome} possui o RG ${this.rg}"
    }

    override  fun hashCode(): Int{
        return this.rg
    }

}


