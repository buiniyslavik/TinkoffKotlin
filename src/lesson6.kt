open class Animal(
    var nickname: String = "",
    var age: Int = 0,
    var sex: Boolean? = null
)

class WildAnimal : Animal()

fun Animal.isAdult(): Boolean {
    println("Checking domestic animal status")
    return age >= 2
}

fun WildAnimal.isAdult(): Boolean {
    println("Checking wild animal status")
    return age >= 3
}

val Animal.respectableNickname: String
    get() = "Dear $nickname"

fun checkAge(an: Animal) {
    if (an.isAdult()) println("adult") else println("not adult")
    println()
    if (an is WildAnimal) {
        if (an.isAdult()) println("adult") else println("not adult")
    }
}

fun main(args: Array<String>) {
    val dog = Animal()
    with(dog) {
        this.nickname = "Tuzik"
        this.age = 2
        this.sex = true
    }
    println(dog.toString())
    println(dog.isAdult())
    println(dog.respectableNickname)
    val parrot = Animal().apply {
        this.nickname = "Kesha"
        this.age = 1
        this.sex = true
    }
    println(parrot.toString())
    println(parrot.isAdult())
    println(parrot.respectableNickname)
    val cat = Animal()
    cat.let {
        it.nickname = "Mashka"
        it.age = 3
        it.sex = false
    }
    println(cat.toString())
    println(cat.isAdult())
    println(cat.respectableNickname)
    val DomesticAmoeba = Animal().also {
        it.nickname = "John"
        it.age = 0
        it.sex = null
    }
    println(DomesticAmoeba.toString())
    println(DomesticAmoeba.isAdult())
    println(DomesticAmoeba.respectableNickname)


    val wolf = WildAnimal().apply {
        nickname = "Woof"
        age = 4
        sex = true
    }
    checkAge(wolf)

}