fun main(){
    var string1 : String = "this is my String"
    var string2 : String = "this is my string too!"
    var string3 : String = "this is my String"
    //string character
    println(string1[11])
    //string length
    println(string1.length)
    println(string2.length)
    //string equality
    println(string1 == string2)
    //string uppercase/lowercase
    println(string2.uppercase())
    //string uppercase/lowercase
    println(string2.lowercase())
    //startswith
    println(string2.startsWith("that"))
    //endswith
    println(string2.endsWith( "too!"))
    //concatenate
    println(string1+" "+string2)
    //substring
    println(string1.substring(6,10))
    //replace
    println(string1.replace("this", "that"))





}