package com.example.maslakotlin

class allRounderImplem(override var ranking: Int,
                       override var score: Int,
                       override var batsmanrank: Int,
                       override var wickets: Int,
                       override var bowlerrank: Int,
                       override var name: String,
                       override var age: Int,
                       override var nationality: String
):AllRounder {
    override fun getranking(): Int {
        return ranking
    }
    override fun print() {
        Batsman::print
        Bowler::print
        println("Therefore, I am an all-rounder")
    }
}
