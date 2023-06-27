import kotlin.random.Random

fun sattoloShuffle(numbers: IntArray) {
    val n = numbers.size
    for (i in n - 1 downTo 1) {
        val j = Random.nextInt(i)
        val temp = numbers[i]
        numbers[i] = numbers[j]
        numbers[j] = temp
    }
}

fun main() {
    val numbers = IntArray(10) { it + 1 }
    println("Original numbers: ${numbers.contentToString()}")

    sattoloShuffle(numbers)
    println("Shuffled numbers: ${numbers.contentToString()}")
}
