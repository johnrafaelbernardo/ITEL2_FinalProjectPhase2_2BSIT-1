package com.example.pinoyrecipeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.pinoyrecipeapp.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btnBistek.setOnClickListener(){
            val intent = Intent(this,Bistek::class.java)
            startActivity(intent)
            this.finish()
        }

        binding.btnSinigang.setOnClickListener(){
            val intent = Intent(this,Sinigang::class.java)
            startActivity(intent)
            this.finish()
        }

        binding.btnChopsuey.setOnClickListener(){
            val intent = Intent(this,Chopsuey::class.java)
            startActivity(intent)
            this.finish()
        }



        binding.btnKaldereta.setOnClickListener(){
            val intent = Intent(this,Kaldereta::class.java)
            startActivity(intent)
            this.finish()
        }

        binding.btnHome2.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }

    }
}