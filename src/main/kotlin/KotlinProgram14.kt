fun main(){

    var names = arrayOf<String>("John","Paul","Mark","Ringo","George")
    var ctr: Int = 0
    while (ctr < names.size) {
        println("Enter new value for index $ctr")
        names[ctr] = readln()

        ctr++

    }
    //display new array values
    var ctr2 : Int =0
    while(ctr2 < names.size){
        println(names[ctr2])

        ctr2++
    }
}