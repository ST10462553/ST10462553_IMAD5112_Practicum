package com.example.st10462553_imad5112_practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Arrays

class Mainmenu : AppCompatActivity() {
    //create an array for days
    val Days= arrayOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday", "Sunday")
    lateinit var DaysTextView:TextView
    lateinit var dayTextView: TextView
    lateinit var monEditText: EditText
    lateinit var minTextView: TextView
    lateinit var btnClear:Button
    lateinit var btnExitApp:Button
    lateinit var btnDetails:Button
    lateinit var button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainmenu)
        //   Retrieve DaysTextView
        var DaysTextView=findViewById<TextView>(R.id.DaysTextView)
        DaysTextView.text = Arrays.toString(Days)

        // display the days to display string
        var daysDisplay= ""
        var counter = 0
        while (counter <7) {
            daysDisplay +="${Days[counter]}\n"
            counter++
        }
        // set textViews text to string rep. of days
        DaysTextView.text = daysDisplay

        // elements from main screen
        monEditText=findViewById<EditText>(R.id.monEditText)
        dayTextView=findViewById<TextView>(R.id.dayTextView)
        minTextView=findViewById<TextView>(R.id.minTextView)
        DaysTextView=findViewById<TextView>(R.id.DaysTextView)

        button4.setOnClickListener {
            minTextView.text="${monEditText}"
        }
        btnDetails.setOnClickListener {
            val intent2=Intent(this@Mainmenu, MoreDetailsActivity::class.java)
            startActivity(intent2)
        }
        //btn clear deletes input from editTexts
        btnClear.setOnClickListener {
            monEditText.text.clear()

        }


    }
}