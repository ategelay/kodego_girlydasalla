package exercises

fun main(){

    println("Enter a word")
    var word1 : String = readln().toString()

    var word2 = word1.reversed()

    println(word2)

    if((word1) == (word2)){
        println("Your answer is a PALINDROME")
    }else{
        println("Your answer is not Palindrome")
    }
    println("Thank you for playing.")
}
