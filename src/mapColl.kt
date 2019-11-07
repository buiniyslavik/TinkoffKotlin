fun main() {
    val names = arrayListOf<String>("Хрюша", "Степаша", "Филя", "Гуля")
    val hello = names.map {
        "Привет $it"
    }

    hello.forEach { println(it) }
}