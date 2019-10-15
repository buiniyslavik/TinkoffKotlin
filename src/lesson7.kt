open class Animal(
    var nickname: String = "",
    var age: Int = 0,
    var sex: Boolean? = null
)

class Cat : Animal()
class Dog : Animal()

class Owner<T : Animal>(
    val currentPet: T
) {
    fun feed() {
        println("${currentPet.nickname} накормлено")
    }
}

fun main(args: Array<String>) {
    val dog = Dog()
    with(dog) {
        this.nickname = "Tuzik"
        this.age = 2
        this.sex = true
    }
    val dogOwner = Owner(dog)
    dogOwner.feed()
    val cat = Cat()
    cat.let {
        it.nickname = "Mashka"
        it.age = 3
        it.sex = false
    }
    val catOwner = Owner(cat)
    catOwner.feed()
}