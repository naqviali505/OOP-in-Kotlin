package com.example.maslakotlin

interface Batsman :Cricketer{

    public var score: Int
    public var batsmanrank: Int
    public override fun print()
    public fun getranking(): Int
}
