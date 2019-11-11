fun main() {
    val names = arrayListOf<String>("Хрюша", "Степаша", "Филя", "Гуля")
    if (names.any {
            it.length == 7
        }) {
        println("there are 7-char names")
    } else {
        println("there are NO 7-char names")
    }
}