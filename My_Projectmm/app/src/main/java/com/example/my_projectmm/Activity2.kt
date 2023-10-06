package com.example.my_projectmm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.count_tv
import kotlinx.android.synthetic.main.activity_2.id_go
import kotlinx.android.synthetic.main.activity_2.idback
import kotlinx.android.synthetic.main.activity_2.idcount

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)


        idback.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)

            startActivity(intent)
        }
        var count =0

        idcount.setOnClickListener {
            count++

            count_tv.text =("Increment value: $count")

        }

        id_go.setOnClickListener {

            val intent  = Intent(this,Activity3::class.java)

            startActivity(intent)


        }
    }
}