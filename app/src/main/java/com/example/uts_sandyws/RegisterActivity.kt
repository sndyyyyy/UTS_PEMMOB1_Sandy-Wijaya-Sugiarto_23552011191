package com.example.uts_sandyws

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val btnDaftarAkun = findViewById<Button>(R.id.registerButton)

        btnDaftarAkun.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            if (email.isNotBlank() && password.isNotBlank()) {
                UserData.userList.add(Pair(email, password))
                Toast.makeText(this, "YEAY! AKUN BERHASIL DIBUAT", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "JANGAN DIKOSONGIN DONG!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}