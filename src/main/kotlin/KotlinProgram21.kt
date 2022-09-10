fun main(){
        //instantiation - process of creating an object
        //any name of the object sample myObject
    var myObject = MyClass("Hello World")
    var myGenericObject = MyGenericClass("Hi")

}
//Generics
class MyGenericClass<T>(value:T ){
    init{
        println(value.toString().length)
    }
}
//Non generic class
class MyClass(value : String){
    init{
        println(value.length)
    }
}



/*
Class -> objects (class ginagamit sa pag create ng object)
object -> variable
       -> functions(process)
uppercase -> first letter
String
Int

 */