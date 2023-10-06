package com.example.activity_spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
import kotlinx.android.synthetic.main.activity_main.spDays
import kotlinx.android.synthetic.main.activity_main.spMonths

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val castomList = listOf("FirstNumber","SecondNumber","ThirdNumber","FourthNumber")
        val adapter = ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,castomList)
        spDays.adapter =adapter

        spMonths.onItemSelectedListener = object: AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(adapterview: AdapterView<*>?, view: View?, position: Int, id: Long) {

                Toast.makeText(this@MainActivity,
                    "You selected Month ${adapterview?.getItemAtPosition(position).toString()}",
                    Toast.LENGTH_LONG).show()

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

        spDays.onItemSelectedListener = object: AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(adaoterview: AdapterView<*>?, p1: View?, postion: Int, id: Long) {
                Toast.makeText(this@MainActivity, "You selected Day ${adaoterview?.getItemAtPosition(postion).toString()}",

                Toast.LENGTH_LONG).show()

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

    }
}