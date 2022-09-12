package com.example.appsqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.appsqlite.db.DBHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome: EditText = findViewById(R.id.edtnome)
        val endereco: EditText = findViewById(R.id.edtendereco)
        val bairro: EditText = findViewById(R.id.edtbairro)
        val cep: EditText = findViewById(R.id.edtcep)

        val btn: Button = findViewById(R.id.btnCadastrar)

        nome.setText(intent.getStringExtra("name"))
        endereco.setText(intent.getStringExtra("endereco"))
        bairro.setText(intent.getStringExtra("bairro"))
        cep.setText(intent.getStringExtra("cep"))

        val intent: Intent
        val db = DBHelper(this, null)

        btn.setOnClickListener{
            db.addPessoa(nome.text.toString(), endereco.text.toString(), bairro.text.toString(), cep.text.toString())
            finish()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}