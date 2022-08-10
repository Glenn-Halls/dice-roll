package com.example.coinsndice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = dieRoll.toString()
    }

}

// Creates a Die with [numSides] sides
class Die(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
