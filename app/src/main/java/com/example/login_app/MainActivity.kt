package com.example.login_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userName : EditText = findViewById(R.id.etName)

        var password : EditText = findViewById(R.id.etPassword)

        var login : Button = findViewById(R.id.btnLogin)

        login.setOnClickListener()
        {
            val name : String ="Kanchan"
            val pass : String = "456"
            if (userName.equals(name) || password.equals(pass))
            {
                Toast.makeText( this,"Login Sucrssful",Toast.LENGTH_SHORT)
            }
            else
            {
                Toast.makeText( this,"Login Login Failed",Toast.LENGTH_SHORT)
            }
        }

    }
}