import java.util.Random

fun isSorted(arr: IntArray): Boolean {
    for (i in 1 until arr.size) {
        if (arr[i] > arr[i - 1]) {
            return false
        }
    }
    return true
}

fun shuffle(arr: IntArray) {
    val random = Random()
    for (i in arr.indices) {
        val j = random.nextInt(i + 1)
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
}

fun reverseBogosort(arr: IntArray) {
    while (!isSorted(arr)) {
        shuffle(arr)
    }
}

fun main() {
    val arr = IntArray(10) { it + 1 }
    println("Before sorting: ${arr.joinToString()}")
    reverseBogosort(arr)
    println("After sorting: ${arr.joinToString()}")
}
