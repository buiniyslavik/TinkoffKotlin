import java.util.Scanner

val scan3 = Scanner(System.`in`)

fun makeCatVoice(e: Cat2){
    e.voice()
}
open class Cat2 {
    open fun voice() {
        println("Meow meow meow!!!")
    }
}

class HomeCat(val ownerName: String): Cat2() {
    override fun voice() {
        println("Meoooooow! Feed me, $ownerName!")
    }
}
fun main(args: Array<String>) {
    val usualCat = Cat2()        // Создаем обычного кота

    val name = scan3.next()      // Считываем имя
    val homeCat = HomeCat(name) // Передаём в конструктор

    val num = scan3.nextInt()

    repeat(num) {
        makeCatVoice(usualCat)
        makeCatVoice(homeCat)
    }
}