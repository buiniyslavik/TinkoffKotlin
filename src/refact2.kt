fun main() {
    val src1 = listOf("Крош", "Ежик", "Нюша", "Бараш")
    val dest1 = mutableListOf<String>()

    src1.forEach { dest1.add(it) } // но можно через addAll
    dest1.forEach { println(it) }

    val src2 = setOf("Крош", "Ежик", "Нюша", "Бараш")
    val dest2 = mutableSetOf<String>()
    dest2.addAll(src2)
    dest2.forEach { println(it) }
}