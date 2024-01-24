package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)
        val signupBtn= findViewById<Button>(R.id.loginscreen_signup_btn)
        val loginBtn=findViewById<Button>(R.id.loginscreen_login_btn)
        val googleBtn=findViewById<Button>(R.id.loginscreen_googlelogin_btn)
        signupBtn.setOnClickListener{
            val intent=Intent(this,SignupActivity::class.java)
            startActivity(intent)

        }


    }

}