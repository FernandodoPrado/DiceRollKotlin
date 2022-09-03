package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
/*
Makes it possible to roll a dice and see the output
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

    }
/*
Rolls the dice and updates the textview
 */
    private fun rollDice() {
    //creates an object from Dice to have 6 sides
        val dice = Dice(6)
        val diceRoll = dice.roll()
    //creates a second dice from dice to have 20 sides
        val dice1 = Dice(20)
        val diceR = dice1.roll()
    //sets the textview to the result of the random number
        val resultTV: TextView = findViewById(R.id.textView)
        resultTV.text = diceRoll.toString()
        val resultTV1: TextView = findViewById(R.id.textView1)
        resultTV1.text = diceR.toString()
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}