fun main() {
    // Stage 1
    val botName = "Codus"
    val birthYear = 2042

    println("""
        Hello! My name is $botName.
        I was created in $birthYear.
    """.trimIndent())

    // Stage 2
    println("Please, remind me your name.")
    val userName: String = readln()
    println("What a great name you have, $userName!")

    // Stage 3
    println("""
        Let me guess your age.
        Enter remainders of dividing your age by 3, 5 and 7.
    """.trimIndent())

    val (remainder3, remainder5, remainder7) = Array(3) { readln().toInt() }
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
}