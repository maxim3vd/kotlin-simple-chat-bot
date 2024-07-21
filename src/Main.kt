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

    println("Your age is $age; that's a good time to start programming!")

    // Stage 4
    println("Now I will prove to you that I can count to any number you want.")
    val start = 0
    val end: Int = readln().toInt()
    for (i in start..end) {
        println("$i!")
    }

    // Stage 5
    println("""
        Let's test your programming knowledge.
        Why do we use methods?
        1. To repeat a statement multiple times.
        2. To decompose a program into several small subroutines.
        3. To determine the execution time of a program.
        4. To interrupt the execution of a program.
    """.trimIndent())

    do {
        val answer: Int = readln().toInt()
        if (answer != 2) {
            println("Please, try again.")
        }
    } while (answer != 2)
}