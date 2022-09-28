package oop3

abstract  class Animal {
    //1) it can have abstract functions
    //2) abstract functions are functions without a body/implementation
    //3) only abstract classes can have abstract function
    //4) you cannot create and object fromm an abstract class
    //5) abstract is always a superclass only
    //6) when you inherit from an abstract class, you are
    // REQUIRED to override all its abstract functions

    abstract fun walk()

    abstract fun makeSound()
}