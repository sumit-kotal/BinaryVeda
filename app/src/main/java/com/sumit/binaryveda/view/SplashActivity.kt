package com.sumit.binaryveda.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.sumit.apps10x.R

class SplashActivity : AppCompatActivity() {
    val SPLASH_DELAY: Long = 3000 //Time delay to remove splash screen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
        /* Add Delay to show Login/Home Screen after Splash Screen*/
        Handler().postDelayed({
            val i = Intent(this, FirstActivity::class.java)
            startActivity(i)
            finish()
        }, SPLASH_DELAY)
    }
}