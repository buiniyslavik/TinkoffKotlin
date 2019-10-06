import kotlin.system.exitProcess

abstract class Pet() {
    abstract val name: String
    abstract val age: Int
    var howDirty = 0
    var howHungry = 0
//    abstract fun feed()
//    abstract fun clean()
}

interface Flyable {
    fun fly()
}

interface Walkable {
    fun walk()
}

interface Swimable {
    fun swim()
}

interface Crawlable {
    fun crawl()
}

interface Voiceable {
    fun voice()
}


class Dog(name: String, age: Int) : Pet(), Voiceable, Walkable
{
    override val name = name
    override val age = age
    override fun voice() {
        println("bark")
    }

    override fun walk() {
        println("*dog walking sounds*")
    }
}

class Cat(name: String, age: Int) : Pet(), Voiceable, Walkable
{
    override val name = name
    override val age = age
    override fun voice() {
        println("ニャ！")
    }

    override fun walk() {
        println("*cat walking sounds*")
    }
}

class Parrot(name: String, age: Int) : Pet(), Voiceable, Flyable
{
    override val name = name
    override val age = age
    override fun voice() {
        println("*censored*")
    }

    override fun fly() {
        println("*wing flapping sound*")
    }
}
class Snake(name: String, age: Int) : Pet(), Crawlable
{
    override val name = name
    override val age = age
    override fun crawl() {
        println("*have you ever heard a snake crawling?*")
    }
}

class Fish(name: String, age: Int) : Pet(), Swimable
{
    override val name = name
    override val age = age
    override fun swim() {
        println("*water sounds*")
    }
}

fun main() {
    println("Choose mode:\n1. Play\n2. Demo")
    when(readLine()?.toInt())
    {
        1 -> play()
        2 -> demo()
        else ->
        {
            println("Wrong option selected!")
            exitProcess(-1)
        }
    }
}

fun play() {
    println("Choose your destiny:")
    println("1. Собака")
    println("2. Кот")
}

fun demo() {
    val snek = Snake("snek", 2)
    println("My snake's name is ${snek.name} and it's ${snek.age} years old.\n" +
            "It can crawl:")
    snek.crawl()

    val f = Fish("catsnack", 1)
    println("My fish' name is ${f.name} and it's ${f.age} years old.\n" +
            "It can swim:")
    f.swim()
    val c = Cat("Baron", 4)
    println("My cat's name is ${c.name} and it's ${c.age} years old.\n" +
            "It can meow2 and walk.")
    c.walk()
    c.voice()
    println("You've got the idea.")
}