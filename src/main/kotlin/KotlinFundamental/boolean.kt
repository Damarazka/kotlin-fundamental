package KotlinFundamental


fun main() {
    val now = 20
    val officeOpen = 7
    val officeClosed = 16


    // Conjunction or and
    val isOpen = now >= officeOpen == now <= officeClosed
    val isClose = now < officeOpen || now > officeClosed

    println("office is close : $isClose")
    println("Office is open : $isOpen")

    if (!isOpen){
        println("the office already closed")
    }else{
        println("the office already open")
    }
}

