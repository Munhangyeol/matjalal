package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spalsh_screen)
      android.os.Handler(Looper.getMainLooper()).postDelayed({
         val intent= Intent(this,LoginActivity::class.java)
          startActivity(intent)

        },3000)

    }
}