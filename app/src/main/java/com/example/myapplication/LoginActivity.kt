package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)
        val login_btn=findViewById<Button>(R.id.login_login_btn)
        val signup_btn=findViewById<Button>(R.id.login_signup_btn)
        val google_btn=findViewById<Button>(R.id.login_google_btn)
        signup_btn.setOnClickListener{
            val intent=Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
    }

}