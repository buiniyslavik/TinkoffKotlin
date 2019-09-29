import java.util.*

fun main()
{
    val testA = arrayOf(10,6,7,3,9,4,5,2,1,8)
    sortArr(testA)
    for(i in testA) print("$i ")

}

fun sortArr(a: Array<Int>)
{
    for(i in 0..a.size-1)
    {
        for(j in (0..a.size-i-2))
        {
            if(a[j]>a[j+1])
            {
                val tmp = a[j]
                a[j] = a[j+1]
                a[j+1] = tmp
            }
        }
    }
}