fun main() {
    val names = arrayListOf<String>("Хрюша", "Степаша", "Филя", "Гуля")
    val filtered = names.filter {
        it.length < 6
    }
    filtered.forEach { println(it) }
}