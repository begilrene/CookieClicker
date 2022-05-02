package com.example.cookieclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

private var currentScore = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgCookie: ImageView = findViewById(R.id.imgCookie)
        val lblTotal: TextView = findViewById(R.id.lblTotal)
        lblTotal.text = "$currentScore"

        val etName : EditText = findViewById(R.id.etName)
        val btnScore : Button = findViewById(R.id.btnScore)

        imgCookie.setOnClickListener{
            currentScore++
            lblTotal.text = "$currentScore"
        }
        btnScore.setOnClickListener {
            Toast.makeText(this, "Hello ${etName.text}, score: ${lblTotal.text}", Toast.LENGTH_SHORT).show()
        }
    }
}