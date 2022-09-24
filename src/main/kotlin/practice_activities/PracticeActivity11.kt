fun main (){
    while (true) {
        try {
            //Input User.
            print("Enter Product: ")
            var product: String = readln()
            print("Enter Price: ")
            var price: Float = readln().toFloat()
            if (price < 0) {
                println("Invalid Input! ${price} Use positive numbers only.")
                break }
            var newVar = Discount(product, price)
            var str = String.format("%,.2f",newVar.price)
            println("Price of $product is $str")
            //Checking Condition.
            if ((price >= 0) && (price <= 10000)) {
                newVar.operationZeroPercent()
            } else if ((price > 10000) && (price <= 20000)) {
                newVar.operationFivePercent()
            } else if ((price > 20000) && (price <= 50000)) {
                newVar.operationTenPercent()
            } else if ((price > 50000) && (price <= 100000)) {
                newVar.operationFifthteenPercent()
            } else if (price > 100000) {
                newVar.operationTwentyPercent()
            } else println("Invalid Input Please Try Again")
            //Checking exception to the input.
        } catch (e: Exception) {
            println("Invalid Input! Use Integers Only")
            println(e.message)
        }
        print("Enter Again?[Y/N]: ")
        var ask = readln().uppercase()
        if (ask == "Y") {
        } else if (ask == "N") {
            break
        }else println("Invalid Input!")
    }
}
class Discount(var product:String,var price:Float){
    var result = 0F

    //0% Discount Function.
    fun operationZeroPercent() {
        var discount: Float = price * 0.0F
        result = this.price - discount
        var newDiscountFormat = String.format("%.2f",discount)
        var result = String.format("%,.2f",result)
        println("Discount is $newDiscountFormat ")
        println("Net Price is : $result")
    }
    //5% Discount Function.
    fun operationFivePercent() {
        var discount: Float = price * .05F
        result = this.price - discount
        var newDiscountFormat = String.format("%.2f",discount)
        var result = String.format("%,.2f",result)
        println("Discount is $newDiscountFormat")
        println("Net Price is : $result")
    }
    //10% Discount Function.
    fun operationTenPercent() {
        var discount: Float = price * 0.10F
        result = this.price - discount
        var newDiscountFormat = String.format("%,.2f",discount)
        var result = String.format("%,.2f",result)
        println("Discount is $newDiscountFormat")
        println("Net Price is : $result")
    }
    //15% Discount Function.
    fun operationFifthteenPercent() {
        var discount: Float = price * 0.15F
        result = this.price - discount
        var newDiscountFormat = String.format("%.2f",discount)
        var result = String.format("%,.2f",result)
        println("Discount is $newDiscountFormat")
        println("Net Price is : $result")
    }
    //20% Discount Function.
    fun operationTwentyPercent() {
        var discount: Float = price * 0.20F
        result = this.price - discount
        var newDiscountFormat = String.format("%,.2f",discount)
        var result = String.format("%,.2f",result)
        println("Discount is $newDiscountFormat")
        println("Net Price is : $result")
    }
}