fun main() {
    val names = arrayListOf<String>("Хрюша", "Степаша", "Филя", "Гуля")
    val nameSeq = names.asSequence()
    val fancyNames = nameSeq.filter {
        it.length <= 4
    }.map {
        "Привет $it"
    }
    fancyNames.forEach {
        println(it)
    }
}