package com.alcatras.calendar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alcatras.calendar.databinding.ActivityCalendarBinding

class CalendarActivity : AppCompatActivity() {
    private lateinit var binding :ActivityCalendarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCalendarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val calendarView = binding.calendarView
        calendarView.date=System.currentTimeMillis()
        calendarView.setOnDateChangeListener { view, year, month,day ->

            val selectedDate= Time(year,month,day)
            val intent = Intent(this,AllPlansActivity::class.java)
            intent.putExtra("time",selectedDate)
            startActivity(intent)
        }


    }
}