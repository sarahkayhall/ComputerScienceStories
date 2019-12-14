package com.example.myfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.input_text_1.*

const val EXTRA_MESSAGE = "com.example.myfinalproject.MESSAGE"

class InputText1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.input_text_1)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = ""
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true


    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val message = editText11.text.toString()
        val message2 = editText12.text.toString()
        val message3 = editText13.text.toString()
        val message4 = editText14.text.toString()
        val message5 = editText15.text.toString()
        val message6 = editText16.text.toString()


        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
            putExtra("EXTRA_MESSAGE2", message2)
            putExtra("EXTRA_MESSAGE3", message3)
            putExtra("EXTRA_MESSAGE4", message4)
            putExtra("EXTRA_MESSAGE5", message5)
            putExtra("EXTRA_MESSAGE6", message6)

        }

        startActivity(intent)
    }
}
