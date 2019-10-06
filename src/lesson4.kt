abstract class Pet(name: String, age: Int)
{
    val name = name
    val age = age
    var howDirty = 0
    var howHungry = 0
    abstract fun feed()
    abstract fun clean()
}

interface Flyable
{
    fun fly()
}

interface Walkable
{
    fun walk()
}

interface Swimable
{
    fun swim()
}

interface Crawlable
{
    fun crawl()
}

interface Voiceable
{
    fun voice()
}