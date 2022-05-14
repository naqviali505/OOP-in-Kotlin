package com.example.maslakotlin

interface AllRounder:Batsman,Bowler
{
    var ranking:Int
    public override fun getranking():Int
    public override fun print()
}