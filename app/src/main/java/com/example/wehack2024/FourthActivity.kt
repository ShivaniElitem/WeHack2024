package com.example.wehack2024

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity() {

    private lateinit var firstHeaderImage : ImageView
    private lateinit var firstParagraphImage : ImageView
    private lateinit var firstButtonImage : ImageView
    private lateinit var dateImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        firstHeaderImage = findViewById(R.id.firstheader)
        firstHeaderImage.setOnClickListener{
            startActivity(Intent(this, SecondActivity::class.java))
        }

        firstParagraphImage = findViewById(R.id.firstparagraph)
        firstParagraphImage.setOnClickListener{
            startActivity(Intent(this, ThirdActivity::class.java))
        }

        firstButtonImage = findViewById(R.id.firstbutton)
        firstButtonImage.setOnClickListener{
            startActivity(Intent(this, FifthActivity::class.java))
        }

        dateImage = findViewById(R.id.date)
        dateImage.setOnClickListener{
            startActivity(Intent(this, SixthActivity::class.java))
        }
    }
}