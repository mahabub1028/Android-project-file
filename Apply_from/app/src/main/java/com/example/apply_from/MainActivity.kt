package com.example.apply_from

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.id_age
import kotlinx.android.synthetic.main.activity_main.id_birth
import kotlinx.android.synthetic.main.activity_main.id_education
import kotlinx.android.synthetic.main.activity_main.id_firstname
import kotlinx.android.synthetic.main.activity_main.id_gender
import kotlinx.android.synthetic.main.activity_main.id_lastname
import kotlinx.android.synthetic.main.activity_main.id_nationality
import kotlinx.android.synthetic.main.activity_main.id_permanent
import kotlinx.android.synthetic.main.activity_main.id_present
import kotlinx.android.synthetic.main.activity_main.id_religion
import kotlinx.android.synthetic.main.activity_main.id_submit
import kotlinx.android.synthetic.main.activity_main.view.id_religion

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        id_submit.setOnClickListener {

            val firtname = id_firstname.text.toString()
            val lastname = id_lastname.text.toString()
            val age = id_age.text.toString().toInt()
            val gender = id_gender.text.toString()
            val present = id_present.text.toString()
            val permanent = id_permanent.text.toString()
            val religion = id_religion.text.toString()
            val nationality = id_nationality.text.toString()
            val education = id_education.text.toString()
            val birth =id_birth.text.toString()



            Intent(this,Activity_show_information::class.java).also {


                it.putExtra("EXTRA_FIRSTNAME",firtname)
                it.putExtra("EXTRA_LASTNAME",lastname)
                it.putExtra("EXTRA_AGE",age)
                it.putExtra("EXTRA_GENDER",gender)
                it.putExtra("EXTRA_PRESENT",present)
                it.putExtra("EXTRA_PERMANENT",permanent)
                it.putExtra("EXTRA_RELIGION",religion)
                it.putExtra("EXTRA_NATIONALITY",nationality)
                it.putExtra("EXTRA_EDUCATION",education)
                it.putExtra("EXTRA_ BIRTH",birth)

                startActivity(it)
            }



        }




    }
}