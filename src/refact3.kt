fun main() {
    val a = readLine()?.toInt()
    val b = readLine()?.toInt()
    val c = readLine()?.toInt()
    val d = readLine()?.toInt()
    println(compare(a, b, c, d))
}

fun compare(vararg nums: Int?): Int {
    val a = nums.filterNotNull()
    return a.min() ?: 0

}