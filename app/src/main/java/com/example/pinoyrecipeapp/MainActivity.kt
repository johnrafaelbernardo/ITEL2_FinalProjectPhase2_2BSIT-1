package com.example.pinoyrecipeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.pinoyrecipeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btnAdobo.setOnClickListener(){
            val intent = Intent(this,Adobo::class.java)
            startActivity(intent)
            this.finish()
        }

        binding.btnSisig.setOnClickListener(){
            val intent = Intent(this,Sisig::class.java)
            startActivity(intent)
            this.finish()
        }

        binding.btnMenudo.setOnClickListener(){
            val intent = Intent(this,Menudo::class.java)
            startActivity(intent)
            this.finish()
        }
        binding.btnKarekare.setOnClickListener(){
            val intent = Intent(this,Karekare::class.java)
            startActivity(intent)
            this.finish()
        }

         binding.btnNext.setOnClickListener(){
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            this.finish()
        }
        binding.btnLogout.setOnClickListener(){
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            this.finish()
        }
        binding.btnAU.setOnClickListener(){
            val intent = Intent(this,AboutUs::class.java)
            startActivity(intent)
            this.finish()
        }
    }
}
