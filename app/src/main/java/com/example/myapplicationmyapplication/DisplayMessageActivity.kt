package com.example.myapplicationmyapplication

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_display_message.*
import com.google.android.material.snackbar.Snackbar


class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        textView.text = intent.getStringExtra(EXTRA_MESSAGE)

        Toast.makeText(applicationContext, "Hello toast!", LENGTH_SHORT).show()


        val snackbar: Snackbar = Snackbar.make(textView, textView.text, Snackbar.LENGTH_LONG)
        snackbar.show()



    }
}