package com.example.my_projectmm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit.id_checkbox
import kotlinx.android.synthetic.main.activity_edit.id_imageview
import kotlinx.android.synthetic.main.activity_edit.num1
import kotlinx.android.synthetic.main.activity_edit.num2
import kotlinx.android.synthetic.main.activity_edit.result
import kotlinx.android.synthetic.main.activity_edit.result_view

class Activity_Edit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)



        result.setOnClickListener {

            val firstnum = num1.text.toString().toInt()
            val secondnum =num2.text.toString().toInt()
            val result = firstnum+secondnum
            result_view.text=result.toString()

        }
        id_imageview.setOnClickListener {

            val intent = Intent(this,Activity_Imageview::class.java)
            startActivity(intent)
        }

        id_checkbox.setOnClickListener {

            val intent = Intent(this,Activity_checkbox::class.java)
            startActivity(intent)
        }
    }
}