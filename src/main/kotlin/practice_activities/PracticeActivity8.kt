package practice_activities

fun main(){

    println(maxNumber(3,2,5))

}

fun maxNumber(num1:Int, num2:Int, num3:Int):Int{

    var maxValue = 0
    if((num3 > num1) && (num3 > num2)){
        maxValue = num3
    }else if((num1 > num2) && (num1 > num3)){
        maxValue = num1
    }else if((num2 > num1) && (num2 > num3)){
        maxValue = num2
    }
    println("The max value is:")
    return maxValue

}