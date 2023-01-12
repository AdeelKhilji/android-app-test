package com.adeel.diceapplication.MyDice

import kotlin.random.Random

class MyDice
{
    private var numOne: Int = 0
    private var numTwo: Int = 0
    private var numThree: Int = 0

    fun setNumOne(nOne:Int)
    {
        numOne = nOne
    }
    fun getNumOne():Int
    {
        return numOne
    }

    fun setNumTwo(nTwo:Int)
    {
        numTwo = nTwo
    }
    fun getNumTwo():Int
    {
        return numTwo
    }

    fun setNumThree(nThree:Int)
    {
        numThree = nThree
    }
    fun getNumThree():Int
    {
        return numThree
    }



    fun calcTotal(numOne: Int, numTwo: Int, numThree: Int): Int{
        return numOne + numTwo + numThree
    }

    fun RandomNumber():Int{
        var randNum = Random.nextInt(6) + 1
        return randNum
    }
}