package com.example.maslakotlin

class PG_Student(rollno: String="NULL",
                 Specialization: String="NULL",
                 adharid1: Int,
                 name1: String,
                 address1: String,
                 phone1: Int,
                 profession1: String,
                 sid1: Int,
                 major1: String,
                 year1: Int,
                 semester1: Int,
                 college1: String,
                 grade1: Int):Student(adharid1,name1,address1,phone1,profession1,sid1,major1,year1,semester1,college1,grade1)
{
                    var rollno1: String
                    var Specialization1: String

                     init
                     {
                         println("This is concrete class PG_Student")
                         rollno1=rollno
                         Specialization1=Specialization
                     }
    public fun submitthesis()
    {
        println("I am working on a thesis topic $Specialization1")
    }
    public override fun print()
    {
        super.print()
        println("Roll Number: $rollno1")
        println("Thesis Topic: $Specialization1")
    }
}