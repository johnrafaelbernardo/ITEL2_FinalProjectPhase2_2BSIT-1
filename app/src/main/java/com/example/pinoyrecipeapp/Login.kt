package com.example.pinoyrecipeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.pinoyrecipeapp.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

            binding.btnLogin.setOnClickListener {
                val username = binding.txtUsername.text.toString()
                val password = binding.txtPassword.text.toString()

                if (username == "username" && password == "password") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
                } else {
                    Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
                }
            }

    }
}