package com.example.testble1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MyLog", "START: onCreate")
        /*
        val tvText : TextView = findViewById(R.id.tvText)
        val btnStart: Button = findViewById(R.id.btnStart)

        btnStart.setOnClickListener {
            Log.d("MyLog", "CLICKED: Start")
            tvText.text = "Start"
        }
        val btnStop: Button = findViewById(R.id.btnStop)
        btnStop.setOnClickListener {
            Log.d("MyLog", "CLICKED: Stop")
            tvText.text = "Stop"
        }

         */
    }
    fun onClickStart(view: View) {
        val tvText : TextView = findViewById(R.id.tvText)
        Log.d("MyLog", "CLICKED: Start")
        tvText.text = "Start"
    }
    fun onClickStop(view: View) {
        val tvText : TextView = findViewById(R.id.tvText)
        Log.d("MyLog", "CLICKED: Stop")
        tvText.text = "Stop"
    }
}