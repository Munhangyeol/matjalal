package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_screen)
        val signup_btn=findViewById<Button>(R.id.signup_signup_btn)
        val login_btn=findViewById<Button>(R.id.signup_login_btn)

    }
}