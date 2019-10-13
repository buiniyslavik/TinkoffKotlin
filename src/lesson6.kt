data class Animal(
    var nickname: String = "",
    var age: Int = 0,
    var sex: Boolean? = null
)

fun main(args: Array<String>) {
    val dog = Animal()
    with(dog) {
        this.nickname = "Tuzik"
        this.age = 2
        this.sex = true
    }
    println(dog.toString())
    val parrot = Animal().apply {
        this.nickname = "Kesha"
        this.age = 1
        this.sex = true
    }
    println(parrot.toString())
    val cat = Animal()
    cat.let {
        it.nickname = "Mashka"
        it.age = 3
        it.sex = false
    }
    println(cat.toString())
    val DomesticAmoeba = Animal().also {
        it.nickname = "John"
        it.age = 0
        it.sex = null
    }
    println(DomesticAmoeba.toString())
}