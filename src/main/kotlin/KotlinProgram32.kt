fun main(){
    println("Enter number 1:")
    var num1: Int = readln().toInt()

    println("Enter number 2:")
    var num2: Int = readln().toInt()

    println("Enter number 3:")
    var num3: Int = readln().toInt()

    var total: Int = num1 + num2 + num3

    println("Total is $total")
    try {
        println("Divide by how many?")
        var divisor:Int = readln().toInt()
        println("The answer is ${total / divisor}")
    }catch (e:ArithmeticException){
        println(e)
        println("Division by 0 is not allowed!")
    }catch (e:NumberFormatException) {
        println(e)
        println("Input Digits Only!")
    }catch (e:ArrayIndexOutOfBoundsException) {
        println(e)
        println("Invalid index")
    }finally {
        println("Code finished")
    }
}
