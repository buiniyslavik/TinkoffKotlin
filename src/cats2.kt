open class Cat4 {
    open fun hunt () {
        println("Я охочусь на мышей, ведь я кот!")
    }
}
class HomeCat2: Cat4()
{
    fun hunt(isLazy: Boolean)
    {
        if(isLazy) println("Ты че сдурел? Какие мыши? Иди корми меня, ленивая задница!")
        else super.hunt()

    }
}

fun main()
{
val kote = HomeCat2()
    kote.hunt(false)
    kote.hunt(true)
}