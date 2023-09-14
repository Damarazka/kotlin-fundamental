package KotlinFundamental


fun main(){
    val textString = "jetBrains"
    val char = textString[3]

    val test = "Kolin"
    val statement = "Kotlin is very \"cool\""

    val uniCode = "Unicode test \u00A9"

    // this is escaped String
    val line1 = "line1 \n" +
            "line2 \n" +
            "line3 \n" +
            "line4 \n"

    /*
    \t: menambah tab ke dalam teks.

    \n: membuat baris baru di dalam teks.

    \’: menambah karakter single quote kedalam teks.

    \”: menambah karakter double quote kedalam teks.

    \\: menambah karakter backslash kedalam teks.
    */

    // and this is raw String
    val line2 = """
        Indonesia
        Center Java
        Semarang District
        Tuntang Sub-District
    """.trimIndent()

    println("index $char adalah urutan ke 4")
    for (char in test){
        print("$char ")
    }
    println(statement)
    println(uniCode)
    println(line1)
    println(line2)
}