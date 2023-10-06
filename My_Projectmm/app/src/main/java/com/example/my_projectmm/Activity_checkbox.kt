package com.example.my_projectmm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_checkbox.id_Cheese
import kotlinx.android.synthetic.main.activity_checkbox.id_Meat
import kotlinx.android.synthetic.main.activity_checkbox.id_Onion
import kotlinx.android.synthetic.main.activity_checkbox.id_orders
import kotlinx.android.synthetic.main.activity_checkbox.id_salad
import kotlinx.android.synthetic.main.activity_checkbox.id_toast
import kotlinx.android.synthetic.main.activity_checkbox.tv_order

class Activity_checkbox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)

        id_orders.setOnClickListener {

             val checkedMeatRadioButtonId = id_Meat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)

            val cheese = id_Cheese.isChecked
            val onion = id_Onion.isChecked
            val salad = id_salad.isChecked

            val orderString = "You order a burger with: \n"+

                    "${meat.text} "+

                    (if(cheese)"\nCheese" else " ")+
                    (if(onion) "\nOnion" else " ")+
                    (if(salad) "\nSalad" else " ")

            tv_order.text=orderString
        }

        id_toast.setOnClickListener {

            Toast.makeText(applicationContext ,"HI AM HERE",Toast.LENGTH_LONG).show()
        }


    }
}