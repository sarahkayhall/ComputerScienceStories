package com.example.myfinalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_display_message2.*

class DisplayMessageActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message3)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = ""
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGEEE)
        val message2 = intent.getStringExtra("EXTRA_MESSAGE2")
        val message3 = intent.getStringExtra("EXTRA_MESSAGE3")
        val message4 = intent.getStringExtra("EXTRA_MESSAGE4")
        val message5 = intent.getStringExtra("EXTRA_MESSAGE5")
        val message6 = intent.getStringExtra("EXTRA_MESSAGE6")

        // Capture the layout's TextView and set the string as its text
        val story =
            "One day a child named " + message + " stumbled upon a " + message2 + ". Surprisingly it knew how to code in " + message3 + " in english and " + message4 + ". The child was inspired and sought to learn everything it knew. They even traveled to " +
                    message5 + " for a field trip to learn even more from a " + message6 + ".\nThat’s when the child knew he wanted to be a professor someday too!\n The End."
        textView6.text = story

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
