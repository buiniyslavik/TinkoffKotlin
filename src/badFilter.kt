fun main() {
    val shitCode = listOf("Хрюша", "Степаша", "Филя", "Гуля").filter { it.length > 6 }[0]
    val decentCode = listOf("Хрюша", "Степаша", "Филя", "Гуля").first { it.length > 6 }
    println(shitCode == decentCode)
}