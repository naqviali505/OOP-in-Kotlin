package com.example.maslakotlin

open class Student(
     adharid1: Int,
     name1: String,
     address1: String,
     phone1: Int=0,
     profession1: String,
     sid: Int=0,
     major: String="NULL",
     year: Int=0,
     semester: Int=0,
     college: String=" ",
     grade: Int=0)
    :Person(adharid1,name1,address1,phone1,profession1)
{
    var sid1: Int
    var major1: String
    var year1: Int
    var semester1: Int
    var college1: String
    var grade1: Int
    init
    {
       println("This is polymorphic class Student")
       college1=college
        sid1=sid
        major1=major
        year1=year
        semester1=semester
        grade1=grade
    }
    public override fun print()
    {
        super.print()
        println("*********Student Information*******")
        println("Student ID: $sid1")
        println("College: $college1")
        println("Major: $major1")
        println("Year: $year1")
        println("Semester: $semester1")
        println("Grade: $grade1")
    }
    public override fun register(Course: String):String
    {
        return "The Student is registered in $Course"
    }
    public fun get_grade(Course: String):Int
    {
        return grade1
    }
    public fun attend(Course: String):String
    {
        return "The Student attends $Course"
    }
    public fun learn():String
    {
        return "It is fun learning Software For Mobile Devices in FAST-NU"
    }

}