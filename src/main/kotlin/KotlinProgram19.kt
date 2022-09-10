fun main() {
    var myList = listOf(2, 5, 3, 1) //readonly immutable
    var myList2 = mutableListOf<Int>() //mutable
    myList2.add(7)
    myList2.add(8)
    myList2.add(9)

    myList2[0] = 10

    for(myList2Value in myList){
        println(myList2Value)
    }

    //get 2nd element
    println(myList[1])
    //display size
    println(myList.size)

    //traverse list
    for(listValue in myList){
        println(listValue)
    }

}
