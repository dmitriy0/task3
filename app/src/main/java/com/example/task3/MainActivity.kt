package com.example.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val telegram = findViewById<Button>(R.id.telegram)
        val yandex = findViewById<Button>(R.id.yandex)
        val calculate = findViewById<Button>(R.id.calculate)
        val facebook = findViewById<Button>(R.id.facebook)

        telegram.setOnClickListener{
            val intent = Intent(this, TelegramActivity::class.java)
            startActivity(intent)
        }
        yandex.setOnClickListener{
            val intent = Intent(this, YandexActivity::class.java)
            startActivity(intent)
        }
        calculate.setOnClickListener{
            val intent = Intent(this, CalculateActivity::class.java)
            startActivity(intent)
        }
        facebook.setOnClickListener{
            val intent = Intent(this, FacebookActivity::class.java)
            startActivity(intent)
        }
    }
}