package com.example.st10462553_imad5112_practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnExit:Button
    lateinit var btnMain:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExit=findViewById<Button>(R.id.btnExit)
        btnMain=findViewById<Button>(R.id.btnMain)

        btnMain.setOnClickListener {
        val intent1= Intent(this@MainActivity, Mainmenu::class.java)
            startActivity(intent1)
        }


        btnExit.setOnClickListener {
            System.exit( 0)
        }
    }
}