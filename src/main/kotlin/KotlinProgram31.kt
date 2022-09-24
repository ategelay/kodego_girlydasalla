fun main(){
    try {
        println("Enter number 1:")
        var num1: Int = readln().toInt()
    }catch (e:Exception){
        println("Inavlid input! Digits only!")
    }
    println("-End of Code-")
}

// Exception
// - something that disrupts a normal flow of your code
// recoverable - you handle exceptions

//Error
//unrecoverable

//try - cathc block