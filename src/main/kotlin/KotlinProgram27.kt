//fun main(){
//    var joe = Person("Joe",21)
//    joe.name = "Joe"
//    println(joe.name)
//    joe.walk()
//    joe.eat()
//
//
//
//    var anna = Person()
//    println(anna.name)
//    anna.walk()
//    anna.eat()
//
//    var mark = Person()
//    mark.name = "Mark"
//    println(mark.name)
//
//}
//
//class Person {
//    var name : String = "John"
//    var age : Int = 21
//
//class Person(personName:String, personAge:Int){
//    var name:String = personName
//    var age : Int = personAge
//
//class Person(var name: String, var age: Int){
//
//    fun walk(){
//        println("A person walks")
//    }
//    fun eat(){
//        println("A person eats")
//    }
//}

//***********************************************************************


    fun main(){
        var joe = Person("Joe",21)  //instantiation
        println("*************")
        println("${joe.name}'s current age is ${joe.age}")
        println("After 1 year......")
        joe.ageUp()
        println("${joe.name}'s current age is ${joe.age}")

    }

    class Person(var name: String, var age: Int) {  //constructor

        init{
            println("Object Created!")
            println("name is $name")
            println("age is $age")

        }
        fun walk() {
            println("A person walks")
        }
        fun eat() {
            println("A person eats")
        }
        fun displayAge(){
            println(age)
        }
        fun ageUp(){
            age++
        }

    }












