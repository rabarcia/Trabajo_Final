package com.curso.android.app.practica.proyectofinal

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
        this.binding.button.setOnClickListener{ this.compareText(
            this.binding.text.text,
            this.binding.text1.text )}

    }
    private fun compareText(texto1:string) {
        if (texto1.isBlank() or texto2.isBlank())
        {
            this.binding.textView2.text = ""
               return
        }
        if (texto1 == texto2)
        {
            "Los textos son iguales".also { this.binding.textView2.text = it }
            return
        }
        this.binding.textView2.text = buildString {
            this.append("Los textos No son iguales")
    }
    }
}