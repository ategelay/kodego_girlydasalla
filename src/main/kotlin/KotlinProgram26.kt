fun main(){
    //lambda
    var sum : (Int,Int) -> Int = { num1, num2 ->
        num1 + num2
    }

    println(sum(2,3))
}

fun sum(num1:Int, num2:Int):Int{
    return num1 + num2

}