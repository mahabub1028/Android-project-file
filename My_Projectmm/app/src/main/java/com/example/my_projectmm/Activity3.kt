package com.example.my_projectmm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.idback
import kotlinx.android.synthetic.main.activity_3.Dec_tv
import kotlinx.android.synthetic.main.activity_3.id_back
import kotlinx.android.synthetic.main.activity_3.id_decre
import kotlinx.android.synthetic.main.activity_3.id_edit
import kotlinx.android.synthetic.main.activity_3.id_passing

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        var decre = 0
        id_decre.setOnClickListener {
            decre--

            Dec_tv.text =("Decrement value: $decre ")

        }
        id_back.setOnClickListener {

            val intent = Intent(this,Activity2::class.java)
            startActivity(intent)
        }

        id_edit.setOnClickListener {

            val intent = Intent(this,Activity_Edit::class.java)
            startActivity(intent)
        }

        id_passing.setOnClickListener {

            val intent = Intent(this,Activity_Passingdata::class.java)
            startActivity(intent)
        }
    }
}