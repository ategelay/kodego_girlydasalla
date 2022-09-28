package com.oop

class Manager: Employee() {

    override fun computeBonus(){
        println("Manager bonus is ${bonus+(bonus*0.1)}")
        //additional 10%
    }
}