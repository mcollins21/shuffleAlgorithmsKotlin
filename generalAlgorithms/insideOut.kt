import java.util.Random

fun insideOutShuffle(arr: IntArray) {
    val random = Random()
    for (i in 1 until arr.size) {
        val j = random.nextInt(i + 1)
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
}

fun main() {
    val arr = IntArray(10) { it + 1 }
    println("Before shuffling: ${arr.joinToString()}")
    insideOutShuffle(arr)
    println("After shuffling: ${arr.joinToString()}")
}
