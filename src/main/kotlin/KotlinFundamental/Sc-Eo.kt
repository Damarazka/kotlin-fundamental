package KotlinFundamental

fun main(){
    // safe call operator
    val text : String? = null
    text?.length

    // elvis operator
    val blank : String? = null
    val fill = blank?.length ?:10

    println(fill)
}