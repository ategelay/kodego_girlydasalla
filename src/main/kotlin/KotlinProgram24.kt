fun main(){
    //    println(total(2,4,5,5))
    var numbers = arrayListOf<Int>()

    println(total2(2,4,6,7,1,2,3,2,4))

}

fun total(num1: Int, num2: Int, num3: Int, num4: Int):Int{
    println("This is total function")
    return num1 + num2 + num3 + num4

}

fun total2(vararg numbers:Int):Int {
    var sumOfAllNumbers: Int = 0;
    for(num in numbers){
        sumOfAllNumbers = sumOfAllNumbers + num
    }
    return sumOfAllNumbers
}