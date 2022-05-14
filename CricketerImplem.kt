package com.example.maslakotlin

open class CricketerImplem(override var name: String=" ", override var age: Int, override var nationality: String="Pakistani"
):Cricketer {
    override fun print() {
        println("My name is $name")
        println("My age is $age")
        println("I am a $nationality")
    }
}