data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val zipCode: String?,
    val phoneNumber: String?
) {
    companion object {
        fun compare(a: Person, b: Person): Int {
            val deltaFirstName = a.lastName.compareTo(b.lastName)
            if (deltaFirstName != 0) return deltaFirstName
            else {
                val deltaLastName = a.lastName.compareTo(b.lastName)
                if (deltaLastName != 0) return deltaLastName
                else {
                    val deltaAge = a.age.compareTo(b.age)
                    if (deltaAge != 0) return deltaAge
                    else return 0
                }
                // sorry for making you read this
            }
        }
    }
}

object PersCom : Comparator<Person> {
    override fun compare(a: Person, b: Person): Int {
        val deltaFirstName = a.lastName.compareTo(b.lastName)
        if (deltaFirstName != 0) return deltaFirstName
        else {
            val deltaLastName = a.lastName.compareTo(b.lastName)
            if (deltaLastName != 0) return deltaLastName
            else {
                val deltaAge = a.age.compareTo(b.age)
                if (deltaAge != 0) return deltaAge
                else return 0
            }
            // sorry for making you read this
        }
    }
}

fun main(args: Array<String>) {
    val vasya = Person("Vasily", "Pupkin", 40, "12345", "+12345678901")
    val vasyasClone = vasya.copy()
    val chicken = Person("Kudah", "Tah-Tah", 1, null, null)
    if (vasya.equals(vasyasClone)) {
        println("vasya идентичен vasyasClone")
    }
    if (vasya.equals(chicken)) {
        println("vasya идентичен курице")
    } else {
        println("vasya не идентичен курице")
    }
    if (Person.compare(vasya, vasyasClone) == 0) {
        println("vasya идентичен vasyasClone, теперь и через companion object")
    }
    if (PersCom.compare(vasya, vasyasClone) == 0) {
        println("vasya идентичен vasyasClone, теперь и через object")
    }

}