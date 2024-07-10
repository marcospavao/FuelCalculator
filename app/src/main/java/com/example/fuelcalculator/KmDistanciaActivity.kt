package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class KmDistanciaActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_km_distancia)

        val buttonKm: Button = findViewById(R.id.buttonkm)
        val tieKmDistancia: TextInputEditText = findViewById(R.id.distancia_destino)

        val precoCombustivel = intent.getStringExtra("preco_combustivel")
        val consumoCarro = intent.getStringExtra("CONSUMO_CARRO")


        buttonKm.setOnClickListener {
            val distanciaDestino = tieKmDistancia.text.toString()
             if (distanciaDestino.isEmpty()) {
                Snackbar.make(
                    tieKmDistancia,
                    "Preencha o campo", Snackbar.LENGTH_LONG
                ).show()
            } else {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("CONSUMO_CARRO", consumoCarro)
                intent.putExtra("preco_combustivel", precoCombustivel)
                intent.putExtra("distancia_destino", distanciaDestino)
                startActivity(intent)
            }
        }
    }
}
