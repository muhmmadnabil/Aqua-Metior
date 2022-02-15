package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        when (binding.tvPhResult.text) {
            6.5..8.5 -> {
                binding.tvResult.text = "المياة مثالية"
            }
            0 downTo 7 -> {
                binding.tvResult.text = "المياة سامة"
            }
            9 downTo 14 -> {
                binding.tvResult.text = "المياة سامة"
            }
            else -> {
                binding.tvResult.text = "المياة جيدة"
            }
        }


    }
}