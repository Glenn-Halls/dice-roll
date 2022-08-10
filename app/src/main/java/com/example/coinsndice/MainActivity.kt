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

        // Find button and set listener
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDie() }

        // Do a random die roll on app startup
        rollDie()
    }

    // Creates a 6 sided die and rolls it
    private fun rollDie() {
        val die = Die(6)
        val dieRoll = die.roll()

        // Find ImageView in layout
        val dieImage: ImageView = findViewById(R.id.imageView)
        
        // Determine drawable based on die roll
        val drawableResource = when (dieRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update image with correct drawable image
        dieImage.setImageResource(drawableResource)

        // Update content description with number on die
        dieImage.contentDescription = dieRoll.toString()

    }
}

// Creates a Die with [numSides] sides
class Die(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
