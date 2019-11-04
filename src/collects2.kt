fun main() {
    val s1 = arrayListOf<String>("Крош", "Ежик", "Нюша", "Бараш")
    val s2 = hashSetOf<String>("Крош", "Ежик", "Нюша", "Бараш")
    s1.forEach { println(it) }
    s2.forEach { println(it) }
}