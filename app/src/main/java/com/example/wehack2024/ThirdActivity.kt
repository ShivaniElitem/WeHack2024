package com.example.wehack2024

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    private lateinit var firstHeaderImage : ImageView
    private lateinit var firstUrlImage : ImageView
    private lateinit var firstButtonImage : ImageView
    private lateinit var dateImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        firstHeaderImage = findViewById(R.id.firstheader)
        firstHeaderImage.setOnClickListener{
            startActivity(Intent(this, SecondActivity::class.java))
        }

        firstUrlImage = findViewById(R.id.firsturl)
        firstUrlImage.setOnClickListener{
            startActivity(Intent(this, FourthActivity::class.java))
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