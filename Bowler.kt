package com.example.maslakotlin

interface Bowler:Cricketer
{
    var wickets:Int
    var bowlerrank:Int
    public override fun print()
    public fun getranking(): Int
}