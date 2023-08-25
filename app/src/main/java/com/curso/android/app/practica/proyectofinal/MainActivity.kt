package com.curso.android.app.practica.proyectofinal

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import com.curso.android.app.practica.proyectofinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(this.layoutInflater)
        this.setContentView(this.binding.root)
        this.binding.button.setOnClickListener { this.compareText() }

    }

    private fun compareText() {
        val texto: String = binding.text.text.toString()
        val texto1: String = binding.text1.text.toString()
        if (texto.isBlank() or texto1.isBlank()) {
            this.binding.textView2.text = ""
            return
        }
        if (texto == texto1) {
            this.binding.textView2.text = "Los textos son iguales"
            return
        }
        this.binding.textView2.text = "Los textos No son iguales"
    }
}