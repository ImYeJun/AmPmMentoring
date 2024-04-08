package com.example.fruitstudy

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val = 상수
        //var = 변수
        val image1 = findViewById<ImageView>(R.id.fruit_image_1)
        val image2 = findViewById<ImageView>(R.id.fruit_image_2)
        val image3 = findViewById<ImageView>(R.id.fruit_image_3)
        val image4 = findViewById<ImageView>(R.id.fruit_image_4)
        val image5 = findViewById<ImageView>(R.id.fruit_image_5)
        val image6 = findViewById<ImageView>(R.id.fruit_image_6)
        val image7 = findViewById<ImageView>(R.id.fruit_image_7)

        image1.setOnClickListener{
            Toast.makeText(this, "1번 사진 클릭",Toast.LENGTH_LONG).show()
        }
        image2.setOnClickListener{
            Toast.makeText(this, "2번 사진 클릭",Toast.LENGTH_LONG).show()
        }
        image3.setOnClickListener{
            Toast.makeText(this, "3번 사진 클릭",Toast.LENGTH_LONG).show()
        }
        image4.setOnClickListener{
            Toast.makeText(this, "4번 사진 클릭",Toast.LENGTH_LONG).show()
        }
        image5.setOnClickListener{
            Toast.makeText(this, "5번 사진 클릭",Toast.LENGTH_LONG).show()
        }
        image6.setOnClickListener{
            Toast.makeText(this, "6번 사진 클릭",Toast.LENGTH_LONG).show()
        }
        image7.setOnClickListener{
            Toast.makeText(this, "7번 사진 클릭",Toast.LENGTH_LONG).show()
        }
    }




}

