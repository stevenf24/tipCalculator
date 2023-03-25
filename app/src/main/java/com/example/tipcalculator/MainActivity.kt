package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
public class View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var amount: Double = findViewById<EditText>(R.id.amount)

    findViewById<Button>(R.id.tenPercent)
    .setOnClickListener
    {
        amount.d("BUTTONS", "User tapped the Supabutton")
    }

    var tipDollars = amount / (10/100)
    var tipCents = amount / (10%100)
    var tip = tipDollars + tipCents
    var total =
    
}