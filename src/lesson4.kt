import java.lang.Exception
import kotlin.system.exitProcess

abstract class Pet() {
    abstract val name: String
    abstract val age: Int
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
    try {
        when (readLine()?.toInt()) {
            1 -> play()
            2 -> demo()
            else -> {
                println("Wrong option selected!")
                exitProcess(-1)
            }
        }
    }
    catch(e: Exception)
    {
        println("you're doing it wrong")
        exitProcess(-1)
    }
}

fun play() {
    class playablePet(name: String, age: Int): Pet()
    {
        override val name = name
        override val age = age
        var howHungry = 1
        var howDirty = 1
        fun feed()
        {
            howHungry = 0
        }
        fun clean()
        {
            howDirty = 0
        }
        fun newDay()
        {
            howHungry++
            howDirty++
        }
        fun hasEscaped(): Boolean {
            return (howDirty>1)
        }
    }

    println("Enter your pet's name:")
    val name: String
    val age: Int
    val tempName = readLine()
    println("Enter your pet's age:")
    val tempAge = readLine()
    try {
        name = if (tempName != null) tempName else throw NullPointerException("Enter something dammit")
        age =
            (if (tempAge != null) tempAge else throw NullPointerException("Enter something dammit")).toInt()
    }
    catch(e: Exception) {
        println("you're doing it wrong")
        exitProcess(-1)
    }

    val myPet = playablePet(name, age)
    var dayCount = 1
    while(true)
    {
        println("Day $dayCount; ${myPet.name} is ${myPet.age} years old; hunger ${myPet.howHungry} dirt ${myPet.howDirty}.\n" +
                "Whatcha doin' today?\n" +
                "1. Feed\n" +
                "2. Clean\n" +
                "3. Nothing\n")
        when(readLine()?.toInt())
        {
            1 -> myPet.feed()
            2 -> myPet.clean()
            3 -> println("Doing nothing")
            else -> println("Bad input, doing nothing")
        }
        if(myPet.hasEscaped())
        {
            println("Your pet has escaped!\nGame over")
            exitProcess(0)
        }
        myPet.newDay()
        dayCount++

    }
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