package com.example.meuprimeiroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    lateinit var btnLogin: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.button)
        btnLogin.setOnClickListener{R.id.button
        val intent = Intent(this, SegundaTela::class.java)
            startActivity(intent)
    }

    }

override fun onStart() {
    super.onStart()
    println("------On Start")
}
override fun onResume() {
    super.onResume()
    println("---On Resume")
}
override fun onRestart(){
    super.onRestart()
    println("----On Restart")
}

override fun onPause() {
    super.onPause()
    println("____On Pause")
}
override fun onStop(){
    super.onStop()
    println("-----On Stop")
}

override fun onDestroy() {
    super.onDestroy()
    println("----On Destroy")
}
}


