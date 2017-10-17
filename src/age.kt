import java.util.*

fun main(args: Array<String>) {
    print("Enter your DOB: ")
    var DOB:Int= readLine()!!.toInt()

    var year=Calendar.getInstance().get(Calendar.YEAR)
    var age:Int?
    age = year-DOB

    println("Your age is $age years")
}