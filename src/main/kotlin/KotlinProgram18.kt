fun main(){
    //declaration maps
    var map = mapOf(1 to "Peter", 2 to "Paul", 3 to "Mary")

    //getting value from map
    println(map[1])
    print(map.get(2))

    //traversing keys
    for (key in map.keys){
        print(key)
    }
    //traversing values
    for (value in map.values){
        print(value)
    }
    //mutable
    var map2 = mutableMapOf<Int,String>()
    map2.put(2, "John")
    map2.remove(2)
    println(map2)

}