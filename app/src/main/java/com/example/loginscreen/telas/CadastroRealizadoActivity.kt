package com.example.loginscreen.telas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.loginscreen.R

class CadastroRealizadoActivity : AppCompatActivity() {

    lateinit var btnVoltarLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_realizado)
        getButton()
        irCadastrado()
    }

    fun getButton() {
        btnVoltarLogin = findViewById(R.id.btn_voltarlogin)
    }

    fun irCadastrado() {
        btnVoltarLogin.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}