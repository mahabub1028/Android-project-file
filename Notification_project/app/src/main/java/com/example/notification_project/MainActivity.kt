package com.example.notification_project

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_main.btnNotification

class MainActivity : AppCompatActivity() {

    val CHANNEL_ID = "ChannelID"
    val CHANNL_NAME = "ChannelName"
    val NOTIFICATION_ID =0


    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         createNotificationChannel()
        val intent = Intent (this,MainActivity::class.java)
        val pendingIntent = TaskStackBuilder.create(this).run {

            addNextIntentWithParentStack(intent)
            getPendingIntent(0,PendingIntent.FLAG_CANCEL_CURRENT)



        }

        val notification = NotificationCompat.Builder(this,CHANNEL_ID)
            .setContentTitle("Awesome notification")
            .setContentText("this is the content text")
            .setSmallIcon(R.drawable.ic_notificaation)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)
            .build()

        val notificationManager = NotificationManagerCompat.from(this)


        btnNotification.setOnClickListener {

           notificationManager.notify(NOTIFICATION_ID,notification)
        }
    }

        fun createNotificationChannel()
        {

            if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){


                val channel = NotificationChannel(CHANNEL_ID,CHANNL_NAME,
                    NotificationManager.IMPORTANCE_DEFAULT).apply {

                        lightColor = Color.GREEN
                      enableLights((true))


                }

                val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager

                manager.createNotificationChannel(channel)
            }


        }

    }
