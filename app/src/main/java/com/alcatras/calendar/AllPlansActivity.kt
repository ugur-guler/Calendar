package com.alcatras.calendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alcatras.calendar.databinding.ActivityAllPlansBinding

class AllPlansActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAllPlansBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAllPlansBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent=intent
        var time= intent.getSerializableExtra("time") as Time
        binding.textView.text=time.day.toString()+" "+time.month.toString() +" " +time.year.toString()
    }
}