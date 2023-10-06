package com.example.intent_service_project

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentService : IntentService("MyIntentService"){

    init
    {
        instence = this
    }

    companion object {

        private lateinit var instence : MyIntentService
        var isRunning = false
        fun stopService()
        {
            Log.d("MyIntentService","Service is stopping...")

            isRunning = false
            instence.stopSelf()

        }
    }



    override fun onHandleIntent(p0: Intent?) {

        try {
            isRunning = true
            while (isRunning)
            {
                Log.d("MyIntentService","Service is running...")
                Thread.sleep(1000)

            }
        } catch (e: InterruptedException) {


             Thread.currentThread().interrupt()


        }

    }
}