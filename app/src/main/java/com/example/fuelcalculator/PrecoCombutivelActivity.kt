package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class PrecoCombutivelActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_preco_combutivel)

        val buttonCombustivel: Button = findViewById(R.id.buttoncombustivel)
        val edtCombustivel: TextInputEditText = findViewById(R.id.tie_Combustivel)

        buttonCombustivel.setOnClickListener {
            val precoCombutivel = edtCombustivel.text.toString()
            val intent = Intent(this, ConsumoCarroActivity::class.java)
            intent.putExtra("preco_combustivel", precoCombutivel)
            startActivity(intent)
        }
    }
}
