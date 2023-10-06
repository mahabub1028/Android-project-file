package com.example.fragment_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btnFragment1
import kotlinx.android.synthetic.main.activity_main.btnFragment2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,firstFragment)
            commit()
        }

        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment,firstFragment)
                addToBackStack(null)
                commit()
            }

        }
        btnFragment2.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment,secondFragment)
                addToBackStack(null)
                commit()
            }

        }
    }
}