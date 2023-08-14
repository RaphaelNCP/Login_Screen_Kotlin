package com.example.loginscreen.telas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.loginscreen.R

class MainActivity : AppCompatActivity() {

    lateinit var btnCadastrar : Button
    lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getButtons()
        irTeladeCadastro()
    }

    fun getButtons() {
        btnCadastrar = findViewById(R.id.btn_cadastrar)
        btnLogin = findViewById(R.id.btn_login)
    }

    fun irTeladeCadastro() {
        btnCadastrar.setOnClickListener() {
            startActivity(Intent(this, TeladeCadastroActivity::class.java))
        }
        btnLogin.setOnClickListener() {
            startActivity(Intent(this, LoginRealizadoActivity::class.java))
        }
    }





}