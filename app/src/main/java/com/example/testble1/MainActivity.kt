package com.example.testble1

import android.Manifest
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    private var btAdapter: BluetoothAdapter? = null
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MyLog", "START: onCreate")
        init()
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
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    private fun init() {
        val btManager = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        btAdapter = btManager.adapter
        getPairedDevices()

    }

    private fun getPairedDevices() {
        val pairedDevices: Set<BluetoothDevice>? = btAdapter?.bondedDevices
        pairedDevices?.forEach {
            Log.d("MyLog", "Name ${it.name}")
        }
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.BLUETOOTH_CONNECT
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            Log.d("MyLog", "ERROR: Bluetooth premissions not granted.")
            return
        }

    }
}