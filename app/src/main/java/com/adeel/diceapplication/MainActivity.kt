package com.adeel.diceapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.adeel.diceapplication.MyDice.MyDice

import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        CUSTOM CODE BELOW

        var textTitle: String = "MyDice - Adeel Khilji"
        this.setTitle(textTitle);

        val textTotal = findViewById<TextView>(R.id.textTotal)
        textTotal.setTextColor(getResources().getColor(R.color.blue, getResources().newTheme()))
        textTotal.text = "Total: "


        val total = findViewById<TextView>(R.id.textTotalNum)
        total.text = "0"

        val btnRandom: Button = findViewById(R.id.btnRandom)
        btnRandom.text = "ROLL"

        val txtNumOne = findViewById<TextView>(R.id.textNumOne)
        txtNumOne.text = "0"

        val txtNumTwo = findViewById<TextView>(R.id.textNumTwo)
        txtNumTwo.text = "0"

        val txtNumThree = findViewById<TextView>(R.id.textNumThree)
        txtNumThree.text = "0"

        total.setTextColor(getResources().getColor(R.color.red, getResources().newTheme()))

        txtNumOne.setTextColor(getResources().getColor(R.color.red, getResources().newTheme()))
        txtNumTwo.setTextColor(getResources().getColor(R.color.red, getResources().newTheme()))
        txtNumThree.setTextColor(getResources().getColor(R.color.red, getResources().newTheme()))


        var dice = MyDice()

        dice.setNumOne(0)
        btnRandom.setOnClickListener{
            if(dice.getNumOne() == 0){
                dice.setNumOne(dice.RandomNumber())
                txtNumOne.text = dice.getNumOne().toString()
            }
            else if(dice.getNumTwo() == 0)
            {
                dice.setNumTwo(dice.RandomNumber())
                txtNumTwo.text = dice.getNumTwo().toString()
            }
            else if(dice.getNumThree() == 0)
            {
                dice.setNumThree(dice.RandomNumber())
                txtNumThree.text = dice.getNumThree().toString()
            }
            else
            {
                total.text = dice.calcTotal(dice.getNumOne(),dice.getNumTwo(),dice.getNumThree()).toString()

                dice.setNumOne(0)
                dice.setNumTwo(0)
                dice.setNumThree(0)

                txtNumOne.text = dice.getNumOne().toString()
                txtNumTwo.text = dice.getNumTwo().toString()
                txtNumThree.text = dice.getNumThree().toString()
            }
        }
    }
}