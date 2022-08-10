package com.example.coinsndice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

// This activity allows the user to roll a 6 sided die and view the result
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDie() }
    }

    // Creates a 6 sided die and rolls it
    private fun rollDie() {
        val die = Die(6)
        val dieRoll = die.roll()

        val dieImage: ImageView = findViewById(R.id.imageView)

        when (dieRoll) {
            1 -> dieImage.setImageResource(R.drawable.dice_1)
            2 -> dieImage.setImageResource(R.drawable.dice_2)
            3 -> dieImage.setImageResource(R.drawable.dice_3)
            4 -> dieImage.setImageResource(R.drawable.dice_4)
            5 -> dieImage.setImageResource(R.drawable.dice_5)
            6 -> dieImage.setImageResource(R.drawable.dice_6)
        }
    }
}

// Creates a Die with [numSides] sides
class Die(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
