package ControlFlow

fun main() {
    // basic way to print
    val color: Color = Color.BLUE
    println(color)

    // print full value / array
    val value : Array<Color> = enumValues()
    value.forEach { color ->
        println(color)
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000) {
        fun printValue() {
            println("value of green is $value")
        }
    },
    BLUE(0x00FF00),
    GREEN(0x0000FF)
}
