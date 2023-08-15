package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercise2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.convert.setOnClickListener{
            var length = binding.length.text.toString().toFloat()
            var width = binding.width.text.toString().toFloat()
            var height = binding.height.text.toString().toFloat()
            var volume = length * width * height
            var cost = volume *0.23
            var charges = volume * 0.5
            var profit = charges-cost

            binding.Volume.setText("Volume = ${String.format("%.1f", volume)} cm³")
            binding.cost.setText("Cost = RM ${String.format("%.2f", cost)}")
            binding.charge.setText("Charges = RM ${String.format("%.2f", charges)}")
            binding.profit.setText("Profit = RM ${String.format("%.2f", profit)}")
        }



        //


    }
}