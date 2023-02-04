package com.alcatras.calendar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            startActivity(Intent(this,CalendarActivity::class.java))
            finish()
        }, splashScreenDuration)
    }
    companion object {
        private const val splashScreenDuration=3000L
    }
}