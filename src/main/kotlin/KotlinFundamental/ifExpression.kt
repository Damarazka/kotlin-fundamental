package KotlinFundamental

val openHours = 7
val now = 20

val you = 8
val late = 7
// val discipline: String

val openDoor = 9
val rightNow = 9
fun main(){
    // single statement
    if (now > openHours){
        println("the office already open")
    }

    // double statement
    if (you < late){
        println("you\'re not late")
    }else{
        println("you are late")
    }

    // more than two
    if (rightNow < openDoor){
        println("the door is closed")
    } else if (rightNow == openDoor){
        println("wait a minute sir")
    }else{
        println("the door already open")
    }
}