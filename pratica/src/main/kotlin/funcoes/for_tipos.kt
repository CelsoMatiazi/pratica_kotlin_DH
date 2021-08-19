package funcoes

fun main() {

    //simpleFor()
    //downTo()
    //until()
    //step()
    letters()
}


fun simpleFor(){
    for(i in 0..20){
        print("$i ")
    }
}


fun downTo(){
    for(i in 20 downTo 0){
        print("$i")
    }
}

fun until(){
    for(i in 0 until  20){
        print("$i")
    }
}


fun step(){
    for(i in 0..20 step  2){
        print("$i")
    }
}


fun letters(){
    val sArray = "Olha essa String"
    for(l in sArray){
        println(l.uppercaseChar())
    }

    // exemplo com forEach
    sArray.forEach { l -> print(l + "") }
}