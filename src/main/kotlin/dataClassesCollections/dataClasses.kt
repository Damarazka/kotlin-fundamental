package dataClassesCollections

class User(val name: String, var age: Int) {
    override fun toString(): String {
        return "User(name=$name,age=$age)"
    }
}

data class DataUser(val name: String, var age: Int)

fun main() {
    val user = User("Damarazka", 18)
    val dataUser = DataUser("Damarazka", 18)
    val dataUser1 = DataUser("Akhyari", 18)
    val dataUser2 = DataUser("azka", 18)
    val dataUser3 = dataUser.copy(age = 20)

    println(user)
    println(dataUser)
    println(dataUser1)
    println(dataUser2)
    println(dataUser3)
}