package practice_activities
//Practice activity - Activity-01 F improvement (Palindrome problem)
fun main(){
    println("Enter String: ")
    var input : String = readln()
    palindromeChecker(input)
}

fun palindromeChecker(input:String){
    var string1 = input.uppercase()
    var reverse = string1.reversed()

    if (string1 == reverse){
        println("$input is a palindrome.")
    }else{
        println("$input is not a palindrome")
    }
}