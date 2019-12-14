package com.example.myfinalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_display_message.*

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = ""
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val message2 = intent.getStringExtra("EXTRA_MESSAGE2")
        val message3 = intent.getStringExtra("EXTRA_MESSAGE3")
        val message4 = intent.getStringExtra("EXTRA_MESSAGE4")
        val message5 = intent.getStringExtra("EXTRA_MESSAGE5")
        val message6 = intent.getStringExtra("EXTRA_MESSAGE6")

        // Capture the layout's TextView and set the string as its text
        val story =
            "Once upon a time in the land of " + message + "\n The " + message2 + " and noble " + message3 + "\n decided that they would create a new and " + message4 + " assignment.\n The new coding project would be about " + message5 + "\n and instead of using a computer to code you'd have to use a " + message6 + ".\n And then all the students failed.\n The End."
        textView6.text = story

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
