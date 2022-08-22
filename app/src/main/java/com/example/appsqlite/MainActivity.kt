package com.example.appsqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome: EditText = findViewById(R.id.edtnome)
        val endereco: EditText = findViewById(R.id.edtendereco)
        val bairro: EditText = findViewById(R.id.edtbairro)
        val cep: EditText = findViewById(R.id.edtcep)
        val btn: Button = findViewById(R.id.btnCadastrar)

        btn.setOnClickListener{

        }
    }
}