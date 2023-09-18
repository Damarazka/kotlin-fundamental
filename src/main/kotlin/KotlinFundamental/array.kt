package KotlinFundamental

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val mixarray = arrayOf(18, "Damarazka a", true)
    // for only one data type
    val onlyInt = arrayOf(1, 2, 3, 4, 5)

    for (first in array){
        print("$first")
    }
    for (second in mixarray){
        println(second.toString())
    }
    onlyInt[2]= 10
    println(onlyInt[2])
}