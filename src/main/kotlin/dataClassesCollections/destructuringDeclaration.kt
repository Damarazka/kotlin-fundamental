package dataClassesCollections

data class Users(val name: String, val age: Int) {
    fun intro() {
        println("Hello my name is $name and iam $age years old")
    }
}

fun main() {
    val dataUser = Users("Damarazka",18)
    dataUser.intro()
}