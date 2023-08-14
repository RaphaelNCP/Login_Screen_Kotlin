package com.example.loginscreen.telas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.loginscreen.R

class TeladeCadastroActivity : AppCompatActivity() {

    lateinit var btnCadastrado : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acticity_tela_cadastro)
        getButton()
        irCadastrado()
    }

    fun getButton() {
        btnCadastrado = findViewById(R.id.btn_cadastrado)
    }

    fun irCadastrado() {
        btnCadastrado.setOnClickListener() {
            startActivity(Intent(this, CadastroRealizadoActivity::class.java))
        }
    }
}