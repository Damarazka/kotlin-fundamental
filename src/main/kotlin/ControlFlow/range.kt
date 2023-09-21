package ControlFlow

fun main(){
    // val intRange = 1.rangeTo(10)
    // val intRange = 10.downTo(1)

    val intRange = 1..10 step 2
    intRange.forEach {
        print("$it")
    }
    println(intRange.step)

    if (12 !in intRange){
        println("the number there is no in variable")
    }else{
        println("yes 12 there is in variable")
    }
}