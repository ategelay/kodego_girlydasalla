package practice_activities
fun main(){
    //sales discount
    var discount1: Int = 0


    println("Enter product:")
    var product: String= readln().toString()

    println("Enter price:")
    var price: Double = readln().toDouble()

    println("Price of $product is $price")

    if((price >=0)&&(price <=10000.00)) {
        println("Discount is ")
        println("Net price is ")
    }else if((price >=10001.00)&&(price <=20000.00)){
        println("Discount is  ")
        println("Net price is ")
    }else if((price >=20001.00)&&(price <=50000.00)){
        println("Discount is  ")
        println("Net price is ")
    }else if((price >=50001.00)&&(price <=100000.00)){
        println("Discount is ")
        println("Net price is ")
    }else if(price > 100000.00) {
        println("Discount is ")
        println("Net price is ")
    }

}

