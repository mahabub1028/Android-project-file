package com.example.my_projectmm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view.id_view

class Activity_View : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE", 0)
        val country = intent.getStringExtra("EXTRA_COUNTRY")
        val gender = intent.getStringExtra("EXTRA_GENDER")

        val idview = "Name: $name \n Age:$age  \n Country: $country \n Gender: $gender"
        id_view.text =idview
    }
}