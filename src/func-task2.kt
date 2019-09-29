import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val s = scan.next()
    print(isCapitalized(s))
}

fun isCapitalized(s: String): Boolean = s[0].isUpperCase()