class objContext {
    infix fun name(n: String) {
        println("<name>$n</name>")
    }

    infix fun surname(n: String) {
        println("<surname>$n</surname>")
    }

    infix fun birthDate(d: String) {
        println("<birthDate>$d</birthDate>")
    }

    infix fun addresses(a: List<String>) {
        println("<addresses>")
        a.forEach { println("<address>$it</address>") }
        println("</addresses>")
    }
}

fun obj(block: (objContext) -> Unit) {
    println("<object>")
    block(objContext())
    println("</object>")
}

fun main() {
    val dude = obj {
        it name "vasya"
        it surname "pupkin"
        it birthDate "01.01.1980"
        it addresses listOf("addr1", "addr2")
    }
}