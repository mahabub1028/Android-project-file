package com.example.my_projectmm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.btn
import kotlinx.android.synthetic.main.activity_main.btn2Apply
import kotlinx.android.synthetic.main.activity_main.edt1
import kotlinx.android.synthetic.main.activity_main.edt2
import kotlinx.android.synthetic.main.activity_main.edt3
import kotlinx.android.synthetic.main.activity_main.edt4
import kotlinx.android.synthetic.main.activity_main.idanother
import kotlinx.android.synthetic.main.activity_main.idbutton
import kotlinx.android.synthetic.main.activity_main.idtv
import kotlinx.android.synthetic.main.activity_main.tv


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        btn2Apply.setOnClickListener {

            val firstName = edt1.text.toString()
            val lastName = edt2.text.toString()
            val DateBirth = edt3.text.toString()
            val country = edt4.text.toString()
            Log.d(
                "MainActivity",
                " $firstName $lastName, bron on $DateBirth, from $country just apply to the formula"
            )
        }

        var count = 0
        btn.setOnClickListener {
            count++
            tv.text = "Count together: $count"


        }
        var decrement=100

        idbutton.setOnClickListener {

            decrement--
            idtv.text = "Decrement Together: $decrement"
        }

        idanother.setOnClickListener {

            val intent =Intent(this,Activity2::class.java)
            startActivity(intent)

        }


    }


    }
