package com.romakumari.alertdialogtext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    var tvRandom:TextView?=null
    var btnRandomAlert: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvRandom=findViewById(R.id.tvRandom)
        btnRandomAlert=findViewById(R.id.btnRandomAlert)
        btnRandomAlert?.setOnClickListener {
                AlertDialog.Builder(this)
                    .setTitle("Random Text")
                    .setMessage(" How many random words you want to add?")
                    .setCancelable(false)
                    .setNegativeButton("3"){_,_,->
            Toast.makeText(this,"clicked 3",Toast.LENGTH_SHORT).show()
            for (i in 0..2)
            {
                val rand=('a'..'z').random()
                tvRandom?.setText(tvRandom?.text.toString()+rand.toString())
            }
        }
                    .setPositiveButton("4"){_,_,->
                        Toast.makeText(this,"clicked 4",Toast.LENGTH_SHORT).show()
                        for (i in 0..3){
                            val rand2=('a'..'z').random()
                            tvRandom?.setText(tvRandom?.text.toString()+rand2.toString())

                        }

                    }.show()
    }}
}