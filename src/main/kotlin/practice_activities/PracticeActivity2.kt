package practice_activities

fun main(){
    println("Enter Grade in Math:")
    var number1 : Int = readln().toInt()

    println("Enter Grade in English:")
    var number2 : Int = readln().toInt()

    println("Enter Grade in Filipino:")
    var number3 : Int = readln().toInt()

    var sum : Int = number1+ number2 + number3
    print("The sum is $sum")

}