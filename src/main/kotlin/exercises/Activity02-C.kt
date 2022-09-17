package exercises

fun main() {

    println("List of Items from Grocery Store")

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