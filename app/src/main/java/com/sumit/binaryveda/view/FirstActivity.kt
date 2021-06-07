package com.sumit.binaryveda.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sumit.binaryveda.databinding.ActivityFirstBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FirstActivity : AppCompatActivity() {


    private lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.registerText.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java))
        }
    }
}