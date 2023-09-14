package KotlinFundamental

fun main(){
    val user = setUser("Damarazka",18)
    println(user)

    setAddress("Semarang",45777)
}

// this is how it"s written
/*fun functionName(param1 : datatype,param2 : datatype) : returnType{
    return result
}*/

// method 1
fun setUser(name : String,age : Int):String{
    return "my name is $name and iam $age years old"
}

// method 2
fun setAddress(city : String, postalCode : Int) {
 println("Iam life in $city and my postal code is $postalCode")
}


