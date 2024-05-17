package com.example.pinoyrecipeapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.pinoyrecipeapp.databinding.ActivityAdoboBinding

class Adobo : AppCompatActivity() {
    private lateinit var binding: ActivityAdoboBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdoboBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.txtRecipe.text = "Ingredients\n\n" +
                "2 tablespoons vegetable oil\n" +
                "\n" +
                "1 (3 pound) chicken, cut into pieces\n" +
                "\n" +
                "1 large onion, quartered and sliced\n" +
                "\n" +
                "2 tablespoons minced garlic\n" +
                "\n" +
                "⅔ cup low sodium soy sauce\n" +
                "\n" +
                "⅓ cup white vinegar\n" +
                "\n" +
                "1 tablespoon garlic powder\n" +
                "\n" +
                "2 teaspoons black pepper\n" +
                "\n" +
                "1 bay leaf"

        binding.txtDirection.text = "Directions\n\n" +
                "Heat vegetable oil in a large skillet over medium-high heat. Cook chicken pieces until golden brown, 2 to 3 minutes per side. Transfer chicken to a plate and set aside.\n" +
                "\n" +
                "Add onion and garlic to the skillet; cook until softened and brown, about 6 minutes.\n" +
                "\n" +
                "Pour in soy sauce and vinegar and season with garlic powder, black pepper, and bay leaf.\n" +
                "\n" +
                "Return chicken to pan, increase heat to high, and bring to a boil. Reduce heat to medium-low, cover, and simmer until chicken is tender and cooked through, 35 to 40 minutes.\n"


        binding.btnHome.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }
        }
}
