package com.dorinidelishki.is_natasha_sleeping

import android.content.Intent
import android.os.Bundle
import android.view.View.VISIBLE
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val aboutButton: ImageView = findViewById(R.id.about_button)
        val nextButton: ImageView = findViewById(R.id.next_button)
        val catImage2: ImageView = findViewById(R.id.cat_image2)
        val catImage3: ImageView = findViewById(R.id.cat_image3)
        val catImage4: ImageView = findViewById(R.id.cat_image4)
        val sniffText: TextView = findViewById(R.id.sniff_text)
        val itWasYouText: TextView = findViewById(R.id.it_was_you_text)
        val sorryText: TextView = findViewById(R.id.sorry_text)
        val whereFishText: TextView = findViewById(R.id.where_fish_text)
        var clickCount = 0

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        aboutButton.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }
            nextButton.setOnClickListener{
                when(clickCount){
                    0 -> {
                        catImage2.visibility = VISIBLE
                        sniffText.visibility = VISIBLE
                    }
                    1 -> {
                        itWasYouText.visibility = VISIBLE
                    }
                    2 -> {
                        catImage3.visibility = VISIBLE
                        sorryText.visibility = VISIBLE
                    }
                    3 -> {
                        catImage4.visibility = VISIBLE
                        whereFishText.visibility = VISIBLE
                    }
                }
                clickCount++
            }

    }


}