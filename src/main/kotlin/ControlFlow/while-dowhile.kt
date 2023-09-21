package ControlFlow
fun main(){
    val char = 'A'
    var value = 1
    while (value <= 7){
        println("test")
        value++
    }

    do {
        println("what")
        value++
    }while (value <= 5)

    // the infinite loop will continue if the condition still true
    do {
        println(char)
    }while (char <= 'Z')
}