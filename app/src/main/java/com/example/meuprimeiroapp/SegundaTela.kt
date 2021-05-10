package com.example.meuprimeiroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaTela : AppCompatActivity() {

  lateinit var btnLogin2: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        btnLogin2 = findViewById(R.id.button2)
        btnLogin2.setOnClickListener {R.id.button2
        val intent = Intent(this, TerceiraTela::class.java)
            startActivity(intent)
        }



    }
}