package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class PrecoCombutivelActivity : AppCompatActivity() {

    private lateinit var buttoncombustivel : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_preco_combutivel)

        buttoncombustivel = findViewById(R.id.buttoncombustivel)

        buttoncombustivel.setOnClickListener { val intent= Intent(this, ConsumoCarroActivity::class.java)
            startActivity(intent) }





    }
    }
