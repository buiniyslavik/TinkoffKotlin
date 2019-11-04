fun main() {
    val src1 = arrayListOf<String>("Крош", "Ежик", "Нюша", "Бараш")
    val dest1 = arrayListOf<String>()
    src1.forEach { dest1.add(it) } // но можно через addAll
    dest1.forEach { println(it) }

    val src2 = hashSetOf<String>("Крош", "Ежик", "Нюша", "Бараш")
    val dest2 = hashSetOf<String>()
    dest2.addAll(src2)
    dest2.forEach { println(it) }
}