fun main() {
//    displayName()

//    displayMessage("Hello!")

    println("Enter your name:")
    var name :String = readln()

    println("Enter your age:")
    var age :Int = readln().toInt()

    displayNameAndAge(name,age)

}

//no return no parameter
fun displayName(){
    println("Peter")
}

//no return with 1 paramenter
fun displayMessage (msg:String){
    println("The message is \"$msg\"")
}

//no return with 2 paramenter
fun displayNameAndAge (name: String,age: Int){
    println("Your name is $name")
    println("Your name is $age")
}

    //function in Kotlin -> java called it methods -> stored procedure -> sub procedure

    //built-in/standard functions in kotlin
    //they have open and close, starts with small letter // abstraction (no need to know whats behind the scene

    //println()
    //toInt()
    //readln()
    //main()
    //arrayOf()
    //listOf()

    // user-defined function

