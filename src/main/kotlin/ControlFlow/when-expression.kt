package ControlFlow

fun main(){
    val range = 20
    val isRange = 1..19
    when(range){
        in isRange -> println("the value is accept")
        !in isRange -> println("the value is not accept")
        else -> println("value undefined")
    }
}