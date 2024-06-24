package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class  KmDistanciaActivity : AppCompatActivity() {

    private lateinit var buttonkm : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_km_distancia)

    buttonkm = findViewById(R.id.buttonkm)

    buttonkm.setOnClickListener { val intent = Intent (this, ResultActivity::class.java)
        startActivity(intent) }

        }
    }
