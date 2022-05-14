package com.example.maslakotlin

class BatsmanImplem(override var score: Int, override var batsmanrank: Int,
                    override var name: String,
                    override var age: Int,
                    override var nationality: String
) :Batsman {
    override fun print()
    {
        Cricketer::print
        println("I am a batsman")
        println("I scored $score")
        println("My rank is $batsmanrank")
    }

    override fun getranking(): Int {
        return batsmanrank
    }

}