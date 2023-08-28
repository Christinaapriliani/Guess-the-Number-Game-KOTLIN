import kotlin.random.Random

fun main() {
    val targetNumber = Random.nextInt(1, 101)
    var attempts = 0

    println("Guess the Number Game")
    println("I'm thinking of a number between 1 and 100.")

    while (true) {
        print("Your guess: ")
        val guess = readLine()?.toIntOrNull() ?: continue
        attempts++

        when {
            guess < targetNumber -> println("Too low. Try again.")
            guess > targetNumber -> println("Too high. Try again.")
            else -> {
                println("Congratulations! You guessed the number in $attempts attempts.")
                break
            }
        }
    }
}
