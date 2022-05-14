package com.example.maslakotlin

abstract class Person(
   var adharid1: Int=0,
     var name1: String="NULL", var address1: String="NULL", var phone1: Int=0, var profession1: String="NULL")
{
     var adharid: Int
     var name: String
     var address: String
     var phone: Int
    var profession: String
    init {
         println("This is abstract class Person")
            this.adharid=adharid1
            this.name=name1
            this.address=address1
            this.phone=phone1
            this.profession=profession1

        }
    public open fun register(UID: String):String
    {
        return "Person $name is registered with ID Card No. $adharid1"
    }
    public fun perform(duty: String):String
    {
        return "Person $name 's profession as $profession"
    }
    public fun include(service: String):String
    {
        return "This person $name offers services related to $profession"
    }
    public fun like(item: String): String
    {
        return "Person $name likes to read articles related to his profession which is $profession "
    }
    public open fun print() {
        println("******Person Information*******")
        println("Aadhaar Id: $adharid")
        println("Name: $name")
        println("Address: $address")
        println("Phone No.: $phone")
        println("Profession: $profession")
    }
}