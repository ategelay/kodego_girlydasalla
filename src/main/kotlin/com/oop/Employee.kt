package com.oop

open class Employee {
    var salary: Double = 3000.00
    var bonus: Double = 1000.00

    init {
        println("New employee created")
    }

    open fun computeBonus(){
        println("Bonus is $bonus")
    }

}