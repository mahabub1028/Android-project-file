package com.example.toolbar_menus

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_alert_dialog.btnDialog1
import kotlinx.android.synthetic.main.activity_alert_dialog.btnDialog2

class Activity_Alert_Dialog : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)



    val addContractDialog = AlertDialog.Builder(this)
        .setTitle("Add contract")
        .setMessage("Do you want to ad Mr, Poop to your contract list")
        .setIcon(R.drawable.ic_add_contracts)
        .setPositiveButton("Yes"){   _,_ ->

            Toast.makeText(this, "You added Mr. Poop to your contract list",Toast.LENGTH_SHORT).show()

        }
        .setNegativeButton("No")
        { _,_ ->
            Toast.makeText(this,"you didn't add Mr.Poop to your contract list",Toast.LENGTH_SHORT).show()

        } .create()

        btnDialog1.setOnClickListener {

             addContractDialog.show()
        }

        val option = arrayOf("First Item","Second Item","Third Item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setSingleChoiceItems(option,0)
            { dialogInterface, i->

                Toast.makeText(this, "You clicked on ${option[i]}",Toast.LENGTH_SHORT).show()

            }

            .setPositiveButton("Accept"){   _,_ ->

                Toast.makeText(this, "You accepted the singleChoiceDialog",Toast.LENGTH_SHORT).show()

            }
            .setNegativeButton("Decline")
            { _,_ ->
                Toast.makeText(this,"You declined the singleChoiceDialog",Toast.LENGTH_SHORT).show()

            } .create()

  btnDialog2.setOnClickListener {

      singleChoiceDialog.show()
  }

    }
}