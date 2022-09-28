package com.oop
//Abstraction // encapsulation
//inheritance -> "is-a relationship
open class Person(name:String, age: Int) {
    var name : String = name
    var age : Int = age

    init{
        println("Object Created!")
        println("name is $name, age is $age")
    }

    //polymorphism
    // 1) overriding - same name, same paramenters,
    // different implementation, one is the superclass,
    // one is in the subclass
    open fun displayName(){
        println("Name is $name")
    }

    // 2) overloading - same name, different parameters, same class
    fun displayName(name: String){
        println("Name is $name")
    }
    fun displayName(numberOfTimes: Int){
        var ctr =numberOfTimes -1
        while(ctr >=0){
            println("Name is $name")
            ctr--
        }
    }
}