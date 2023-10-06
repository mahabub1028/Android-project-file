package com.example.intent_service_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btnSend
import kotlinx.android.synthetic.main.activity_main.btnStart
import kotlinx.android.synthetic.main.activity_main.btnStop
import kotlinx.android.synthetic.main.activity_main.etData
import kotlinx.android.synthetic.main.activity_main.tvService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


          btnStart.setOnClickListener {

              Intent(this, MyService::class.java).also {

                  startService(it)
                  tvService.text = "Service is running"
              }
          }

        btnStop.setOnClickListener {

            Intent(this,MyService::class.java).also {

                stopService(it)
                tvService.text = "Service is stopped"
            }
        }

       btnSend.setOnClickListener {

           Intent(this,MyService::class.java).also {
              val dataString = etData.text.toString()
               it.putExtra("EXTRA_DATA",dataString)
               startService(it)


           }
       }


    }
}





