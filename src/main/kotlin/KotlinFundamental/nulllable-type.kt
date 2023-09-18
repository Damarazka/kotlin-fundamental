package KotlinFundamental

fun main() {
    val some: String? = null
    // there is tow method to fill the null value
    // val fill = some?.length ?:"apaaja"
    // val fill = some ?: "default value"
    //println(fill)


    // val textLength = some.length | it's can't to declare the variable
    if (some != null) {
        val textLength = some.length
    }
}
