package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class PrecoCombutivelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_preco_combutivel)

        val buttonCombustivel: Button = findViewById(R.id.buttoncombustivel)
        val edtCombustivel: TextInputEditText = findViewById(R.id.tie_Combustivel)

        buttonCombustivel.setOnClickListener {
            val precoCombustivel = edtCombustivel.text.toString()

            if (precoCombustivel.isEmpty()) {
                // Mostrar mensagem para o usuário
                Snackbar.make(
                    edtCombustivel,
                    "Preencha o campo",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {
                // Prosseguir com a navegação para a próxima atividade
                val intent = Intent(this, ConsumoCarroActivity::class.java)
                intent.putExtra("preco_combustivel", precoCombustivel)
                startActivity(intent)
            }
        }
    }
}
