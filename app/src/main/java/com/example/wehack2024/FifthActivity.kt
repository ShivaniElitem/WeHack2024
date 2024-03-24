package com.example.wehack2024

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FifthActivity : AppCompatActivity() {

    private lateinit var firstHeaderImage : ImageView
    private lateinit var firstParagraphImage : ImageView
    private lateinit var firstUrlImage : ImageView
    private lateinit var dateImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        firstHeaderImage = findViewById(R.id.firstheader)
        firstHeaderImage.setOnClickListener{
            startActivity(Intent(this, SecondActivity::class.java))
        }

        firstParagraphImage = findViewById(R.id.firstparagraph)
        firstParagraphImage.setOnClickListener{
            startActivity(Intent(this, ThirdActivity::class.java))
        }

        firstUrlImage = findViewById(R.id.firsturl)
        firstUrlImage.setOnClickListener{
            startActivity(Intent(this, FourthActivity::class.java))
        }

        dateImage = findViewById(R.id.date)
        dateImage.setOnClickListener{
            startActivity(Intent(this, SixthActivity::class.java))
        }
    }
}