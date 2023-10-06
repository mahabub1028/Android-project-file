package com.example.apply_from

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_information.btnimplicit
import kotlinx.android.synthetic.main.activity_show_information.id_show

class Activity_show_information : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_information)




        val firstname = intent.getStringExtra("EXTRA_FIRSTNAME")
        val lastname = intent.getStringExtra("EXTRA_LASTNAME")
         val age = intent.getIntExtra("EXTRA_AGE", 0)
        val gender = intent.getStringExtra("EXTRA_GENDER")
        val present = intent.getStringExtra("EXTRA_PRESENT")
        val permanent = intent.getStringExtra("EXTRA_PERMANENT")
        val religion = intent.getStringExtra("EXTRA_RELIGION")
        val nationality = intent.getStringExtra("EXTRA_NATIONALITY")
        val education =  intent.getStringExtra("EXTRA_EDUCATION")
        val birth = intent.getStringExtra("EXTRA_BIRTH")

        val show = "FullName: $firstname\t$lastname\n" +
                "Age: $age\nGender: $gender\n"+
                "Present Address: $present\nPermanent Address: $permanent\n"+
                "Religion: $religion\nNationality: $nationality\n"+
                "Eduction: $education\nBirth Date:$birth"

         id_show.text=show

        btnimplicit.setOnClickListener {

            val intent = Intent(this,Activity_Implicit_Intents::class.java)
            startActivity(intent)
        }
    }
}