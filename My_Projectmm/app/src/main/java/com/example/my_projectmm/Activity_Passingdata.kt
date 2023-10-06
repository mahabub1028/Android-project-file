package com.example.my_projectmm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_passingdata.id_age
import kotlinx.android.synthetic.main.activity_passingdata.id_apply
import kotlinx.android.synthetic.main.activity_passingdata.id_country
import kotlinx.android.synthetic.main.activity_passingdata.id_gender
import kotlinx.android.synthetic.main.activity_passingdata.id_name

class Activity_Passingdata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passingdata)

        id_apply.setOnClickListener {

            val name = id_name.text.toString()
            val age =id_age.text.toString().toInt()
            val country = id_country.text.toString()
            val gener = id_gender.text.toString()



       Intent(this,Activity_View::class.java).also {
            it.putExtra("EXTRA_NAME",name)
            it.putExtra("EXTRA_AGE",age)
            it.putExtra("EXTRA_COUNTRY",country)
            it.putExtra("EXTRA_GENDER",gener)

            startActivity(it)

        }

        }
    }
}