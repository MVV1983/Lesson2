package com.example.lesson2

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService : Service() {

val service = "Service"

    override fun onBind(intent: Intent): IBinder ?{
        return null
    }
}