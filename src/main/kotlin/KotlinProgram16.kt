fun main(){
    var names = ArrayList<String>()
//    names.add("John")
//    names.add("Peter")
//    //add elements
//    println(names[0])
//    println(names[1])
//    //remove elements
//    names.removeAt(0) //Peter -> index 0
//    //display names[0]
//    println(names[0])

    //add names to arrayList
    names.add("Mary")
    names.add("Jenny")
    names.add("Mark")
    names.add("Paul")
    names.add("Bryan")
    names.add("Roel")

    //traverse
    for(value in names){
        println( " $value ")
    }
}