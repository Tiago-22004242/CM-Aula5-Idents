package com.example.ficha5intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ficha5intents.databinding.ActivityMain2Binding
import com.example.ficha5intents.databinding.ActivityMainBinding

const val EXTRA_NAME = "pt.ulusofona.ecati.deisi.cm.calculadora.NAME"
class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onStart() {
        super.onStart()
        binding.buttonBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.apply {
                putExtra(EXTRA_NAME, binding.editWelcolme.text.toString())
            }
            startActivity(intent)
            finish()
        }
    }

}