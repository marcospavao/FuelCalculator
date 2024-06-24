package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ConsumoCarroActivity : AppCompatActivity() {

    private lateinit var buttoncarro : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_consumo_carro)


        buttoncarro = findViewById(R.id.buttoncarro)

       buttoncarro.setOnClickListener {  val intent = Intent( this, KmDistanciaActivity::class.java)
           startActivity(intent) }
    }
}