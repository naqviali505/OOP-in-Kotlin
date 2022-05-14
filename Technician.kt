package com.example.maslakotlin

class Technician(techType: String="NULL",
                 adharid1: Int,
                 name1: String,
                 address1: String,
                 phone1: Int,
                 profession1: String,
                 empid1: String,
                 emprole1: String,
                 empdept1: String,
                 empSalary1: Double,
                 empExperience1: Int):Staff(adharid1,name1,address1, phone1,profession1,empid1,emprole1,empdept1,empSalary1,empExperience1)
{
    var techType1: String=" "
    init
    {
        println("This is concrete class Technician")
        techType1=techType
    }
    public fun mantain(lab:String):String
    {
        return "Technician $techType1 is maintaining $lab"
    }
    public fun install(system:String):String
    {
        return "Technician $techType1 is installing $system"
    }
    public override fun print()
    {
        super.print()
        println("*********Technician Information********")
        println("Technician Type: $techType1")
    }
}