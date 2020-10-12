package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btnRegLogin.setOnClickListener {
            startActivity(Intent( this, LoginActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_from_left)
        }

        btnLogin.setOnClickListener {
            startActivity(Intent( this, PrincipalActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_from_left)
        }

    }
}