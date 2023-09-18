package KotlinFundamental

fun main(){
    val hours = 19
    val name = "Azkaaa"
    val age = 18
    val height : Double = 170.5
    println("halo aku" + name)// it's primitive
    println("helo iam $name")
    println("yosh iam $name and iam $age years old and my height is $height")// you can include the other data type
    println("Office ${if (hours >= 19) "is closed" else "already open"}")// and you can insert expression into String Template
}