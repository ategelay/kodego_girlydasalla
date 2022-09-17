package exercises
//
//fun main(){
//    println("List of Items from Grocery Store")
//    println("W for Wet Goods")
//    println("D for Dry Goods")
//
//    //list of grocery wet
//    var string1 : String = "W Tender Juicy Hotdog"
//    var string2 : String = "W Magnolia Chicken Whole"
//    var string3 : String = "W Magnolia Icecream Cookies and Cream"
//
//    //list of grocery dry
//    var string4 : String = "D Gardenia Wheat Bread"
//    var string5 : String = "D Huggies Diaper Pants XL"
//    var string6 : String = "D Century Tuna Flakes in Oil"
//
//    //string character
//    println(string1[0])
//    println("$string1")
//    println("$string2")
//    println("$string3")
//
//    println(string4[0])
//    println("$string4")
//    println("$string5")
////    println("$string6")
//}
//***********************************************************8888

fun main() {
    var myItems = setOf("hotdog, Whole Chicken")
    //mutable set
    var myItems2 = mutableSetOf<String>()
    myItems2.add("Icecream")
    myItems2.add("Tuna")
    myItems2.add("Diaper")

    myItems2.remove("Diaper")

    for (data in myItems) {
        println(data)
    }

    for (data in myItems2) {
        println(data)
    }
}