package com.example.myfinalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_display_message2.*

class DisplayMessageActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message2)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = ""
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGEE)
        val message2 = intent.getStringExtra("EXTRA_MESSAGE2")
        val message3 = intent.getStringExtra("EXTRA_MESSAGE3")
        val message4 = intent.getStringExtra("EXTRA_MESSAGE4")
        val message5 = intent.getStringExtra("EXTRA_MESSAGE5")
        val message6 = intent.getStringExtra("EXTRA_MESSAGE6")

        // Capture the layout's TextView and set the string as its text
        val story =
            "The coolest new computer is about to drop on the market!! \n" +
                    "It’s called the " + message + " " + message2 + ".0 and comes in all sorts of textures like " + message3 + " and the size " + message4 + ".\n" +
                    "It even has a new feature that allows it to pick up wifi signals from places like the bottom of the ocean and even the moon.\nThere’s even a special deal that if you buy " + message5 + " now, you get a free " + message6 + "!\nHappy Shopping!!\n The End."
        textView6.text = story

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
