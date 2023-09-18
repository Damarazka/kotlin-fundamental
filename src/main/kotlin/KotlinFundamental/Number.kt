package KotlinFundamental

import javax.print.attribute.standard.PrinterInfo

fun main (){
    // 32 bit
    val intNum = 10
    // 64 bit
    val longNum = 1000L
    // 16 bit
    val shortNum : Short = 1
    // 8 bit
    val byteHum : Byte = 0b11010010.toByte()
    // 64 bit
    val douNum : Double = 1.5
    // 32 bit
    val floatNum : Float = 0.12345679f

    // how to know maximum or minimum value
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    val num1 = 12
    val num2 = 15

    val stringNum = "20"
    val intNumb = 20

    val moreReadable = 1_000_000

    println("$intNum, $longNum, $shortNum, $byteHum, $douNum, $floatNum")
    println("$maxInt, $minInt")
    println(num1 + num2 * num1)
    println(intNumb + stringNum.toInt())
    println(moreReadable)
}