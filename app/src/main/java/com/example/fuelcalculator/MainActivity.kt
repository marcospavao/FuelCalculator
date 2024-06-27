package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonini: Button = findViewById(R.id.buttonini)

        buttonini.setOnClickListener {
            val intent = Intent(this, PrecoCombutivelActivity::class.java)
            startActivity(intent)
        }


    }
}
