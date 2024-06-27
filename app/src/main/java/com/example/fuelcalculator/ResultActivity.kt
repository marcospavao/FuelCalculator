package com.example.fuelcalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val buttonInicio: Button = findViewById(R.id.buttonvoltar)

        val precoCombustivel = intent.getStringExtra("preco_combustivel")?.toDouble() ?: 0.0
        val consumoCarro = intent.getStringExtra("CONSUMO_CARRO")?.toDouble() ?: 0.0
        val distanciaDestino = intent.getStringExtra("distancia_destino")?.toDouble() ?: 0.0

        val precoResultado: TextView = findViewById(R.id.preco_resultado)
        val consumoResultado: TextView = findViewById(R.id.consumo_resultado)
        val kmResultado: TextView = findViewById(R.id.km_resultado)
        val textResultado: TextView = findViewById(R.id.textResultado)

        precoResultado.text =
            "Preço Gasolina  R$: " + precoCombustivel
        // posso fazer sem o $ ou com.
        consumoResultado.text = "Consumo Carro   KM/L: $consumoCarro"
        kmResultado.text = "KM Distancia: $distanciaDestino"

        // Realizar o cálculo do custo total
        val custoTotal = (distanciaDestino / consumoCarro) * precoCombustivel
        textResultado.text = "Custo Total: R$ %.2f".format(custoTotal)

        buttonInicio.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
