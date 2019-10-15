data class Animal(
    var nickname: String = "",
    var age: Int = 0,
    var sex: Boolean? = null
)

fun Animal.isAdult(): Boolean {
    return age >= 2
}

val Animal.respectableNickname: String
    get() = "Dear $nickname"

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
}