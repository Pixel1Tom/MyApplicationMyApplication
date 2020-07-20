package com.example.myapplicationmyapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

class custom_toast : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_toast)

        val inflater = layoutInflater
        val container: ViewGroup = findViewById(R.id.custom_toast_container)
        val layout: ViewGroup = inflater.inflate(R.layout.custom_toast, container) as ViewGroup
        val text: TextView = layout.findViewById(R.id.text)
        text.text = "This is a custom toast"
        with (Toast(applicationContext)) {
            setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }




    }
}