package com.example.uts_sandyws

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

object UserData {
    val userList = ArrayList<Pair<String, String>>()
}

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()
        setContentView(R.layout.activity_login)

        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val btnMasuk = findViewById<Button>(R.id.loginButton)
        val btnDaftar = findViewById<Button>(R.id.registerButton)

        btnMasuk.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()
            val found = UserData.userList.any { it.first == email && it.second == password }
            if (found) {
                startActivity(Intent(this, MainActivity::class.java))
            } else {
                Toast.makeText(this, "ISINYA YANG BENER DONG", Toast.LENGTH_SHORT).show()
            }
        }

        btnDaftar.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}