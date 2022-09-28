package com.oop

class Student(name:String, age: Int) : Person(name, age) {

    var studentId : Int = 0

    fun displayStudentId(){
        println(studentId)
    }

    //overriding
    override fun displayName(){
        super.displayName()
        println("This is from the student class")
    }

}

//polymorphism