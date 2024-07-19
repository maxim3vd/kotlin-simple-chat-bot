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
}