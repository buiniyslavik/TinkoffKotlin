import java.util.Scanner

class Car() {
    fun ride(km: Int) {
        println("Поехали!")
        var remainingKm = km
        while(remainingKm>0)
        {
            println("Осталось $remainingKm километров")
            remainingKm--
        }
        println("Приехали!")
    }
}
val scan2 = Scanner(System.`in`)
fun main(args: Array<String>) {
    val car = Car()
    car.ride(scan2.nextInt())
}