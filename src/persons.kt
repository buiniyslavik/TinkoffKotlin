data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val zipCode: String?,
    val phoneNumber: String?
)

fun main(array: Array<String>) {
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
}