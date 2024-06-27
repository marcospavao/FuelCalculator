package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class ConsumoCarroActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_consumo_carro)

        val tieConsumocarro: TextInputEditText = findViewById(R.id.tie_consumocarro)
        val buttonCarro: Button = findViewById(R.id.buttoncarro)
        val precoCombutivel = intent.getStringExtra("preco_combustivel")

        buttonCarro.setOnClickListener {
           val consumoCarro = tieConsumocarro.text.toString()

           val intent = Intent( this, KmDistanciaActivity::class.java);
           intent.putExtra("CONSUMO_CARRO", consumoCarro)
            intent.putExtra("preco_combustivel", precoCombutivel)
           startActivity(intent) }



    }
}