package com.example.pinoyrecipeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.pinoyrecipeapp.databinding.ActivityAboutUsBinding

class AboutUs : AppCompatActivity() {
    private lateinit var binding: ActivityAboutUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.aboutUsTitle.text = "About Us"
        binding.aboutUsContent.text = """
            Welcome to Pinoy Recipe App!
            
            Our app is dedicated to bringing you the best of Filipino cuisine. From the savory Adobo to the comforting Sinigang, our collection of recipes is here to tantalize your taste buds and introduce you to the rich culinary heritage of the Philippines.

            What are you in the mood for? Adobo? Sinigang? We have those classics ready to tantalize your taste buds.

            Happy cooking!
        """.trimIndent()

        binding.btnHomeAU.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }

}