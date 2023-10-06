package com.example.my_projectmm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit.id_imageview
import kotlinx.android.synthetic.main.activity_imageview2.add_image
import kotlinx.android.synthetic.main.activity_imageview2.id_image

class Activity_Imageview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imageview2)

        add_image.setOnClickListener {

            id_image.setImageResource(R.drawable.pm)
        }
    }
}