package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val charactersButton = findViewById<Button>(R.id.silverwolf)
        charactersButton.setOnClickListener {
            val intent = Intent(this, silverwolf::class.java)
            startActivity(intent)
        }
        val a = findViewById<Button>(R.id.blade)
        a.setOnClickListener {
            val intent = Intent(this, blade::class.java)
            startActivity(intent)
        }
        val b = findViewById<Button>(R.id.kafka)
        b.setOnClickListener {
            val intent = Intent(this, kafka::class.java)
            startActivity(intent)
        }
        val c = findViewById<Button>(R.id.firefly)
        c.setOnClickListener {
            val intent = Intent(this, firefly::class.java)
            startActivity(intent)
        }
    }
}