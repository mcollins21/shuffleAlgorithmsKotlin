import java.util.Collections.shuffle

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    laggedFibonacciShuffle(numbers)
    println(numbers)
}

fun laggedFibonacciShuffle(numbers: MutableList<Int>) {
    val n = numbers.size
    val fibonacci = mutableListOf(0, 1)

    while (fibonacci.last() < n) {
        val next = fibonacci[fibonacci.size - 1] + fibonacci[fibonacci.size - 2]
        fibonacci.add(next)
    }

    for (i in n - 1 downTo 1) {
        var j = fibonacci.size - 1
        while (fibonacci[j] >= n) {
            j--
        }

        if (i != fibonacci[j]) {
            val temp = numbers[i]
            numbers[i] = numbers[fibonacci[j]]
            numbers[fibonacci[j]] = temp
        }
    }

    // Randomize the order of the remaining elements
    shuffle(numbers.subList(1, n))
}
