package practice_activities

fun main(){

    var samsung = Phone("galaxy", "white", 128, 5,168)
    samsung.model = "Galaxy"
    samsung.color = "White"
    samsung.memory = 128
    samsung.cameraPixel = 5
    samsung.weightGrams =168

}


class Phone(var model:String, var color:String, var memory:Int, var cameraPixel:Int, var weightGrams:Int) { //constructor -> primary constructor
    init{
        println("Object Created!")
        println("Phone model is $model")
        println("Color is $color")
        println("memory is $memory")
        println("camera pixel is $cameraPixel")
        println("weight in grams is $weightGrams")
    }
    //secondary constructor

    fun color(){
        println("Phone color is $color")
    }
    fun memory(){
        println("Phone memory is $memory")
    }
    fun cameraPixel(){
        println("Phone camera pixel is $cameraPixel")
    }
    fun weightGrams(){
        println("Phone weight in grams is $weightGrams")
    }
}



