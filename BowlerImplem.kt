package com.example.maslakotlin

class BowlerImplem(override var wickets: Int, override var bowlerrank: Int,
                   override var name: String,
                   override var age: Int,
                   override var nationality: String
):Bowler
{
    override fun print() {
        Cricketer::print
        println("I am a bowler")
    }

    override fun getranking(): Int {
        return bowlerrank
    }
}