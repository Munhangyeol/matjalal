package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import android.widget.EditText

import androidx.appcompat.app.AppCompatActivity

class LoginActivity:AppCompatActivity() {
    lateinit var  login_btn:Button
    lateinit var  signup_btn:Button
    lateinit var google_btn:Button
    lateinit var  id_text:EditText
    lateinit var  password_text:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)
        login_btn=findViewById<Button>(R.id.login_login_btn)
        signup_btn=findViewById<Button>(R.id.login_signup_btn)
        google_btn=findViewById<Button>(R.id.login_google_btn)
        login_btn.setOnClickListener{
            id_text=findViewById(R.id.login_id_edittext)
            password_text=findViewById((R.id.login_password_edittext))
            System.out.println(id_text.text.toString())

        }
        signup_btn.setOnClickListener{
            val intent=Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
        val signupBtn= findViewById<Button>(R.id.loginscreen_signup_btn)
        val loginBtn=findViewById<Button>(R.id.loginscreen_login_btn)
        val googleBtn=findViewById<Button>(R.id.loginscreen_googlelogin_btn)
        signupBtn.setOnClickListener{
            val intent=Intent(this,SignupActivity::class.java)
            startActivity(intent)

        }

    }

}