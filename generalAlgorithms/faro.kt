fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("Initial Order: ${numbers.joinToString(", ")}")

    val iterations = 3 // Number of shuffles to perform

    for (i in 1..iterations) {
        faroShuffle(numbers)
        println("Shuffled Order (Iteration $i): ${numbers.joinToString(", ")}")
    }
}

fun faroShuffle(numbers: MutableList<Int>) {
    val halfSize = numbers.size / 2
    val firstHalf = numbers.subList(0, halfSize)
    val secondHalf = numbers.subList(halfSize, numbers.size)

    numbers.clear()

    for (i in 0 until halfSize) {
        numbers.add(firstHalf[i])
        numbers.add(secondHalf[i])
    }
}
