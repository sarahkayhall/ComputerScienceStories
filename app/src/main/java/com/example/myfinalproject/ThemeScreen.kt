package com.example.myfinalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.theme_screen.*

class ThemeScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.theme_screen)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = ""
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        codingbutton.setOnClickListener {
            val intent = Intent(this, InputText1::class.java)
            startActivity(intent)
        }

        technologybutton.setOnClickListener {
            val intent = Intent(this, InputText2::class.java)
            startActivity(intent)
        }

        professorbutton.setOnClickListener {
            val intent = Intent(this, InputText3::class.java)
            startActivity(intent)
        }

        }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}