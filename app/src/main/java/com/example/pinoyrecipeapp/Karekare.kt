package com.example.pinoyrecipeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.pinoyrecipeapp.databinding.ActivityKarekareBinding

class Karekare : AppCompatActivity() {
    private lateinit var binding: ActivityKarekareBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKarekareBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.txtRecipe4.text = "Ingredients\n\n" +
                "3 lbs oxtail cut in 2 inch slices you an also use tripe or beef slices\n\n" +
                "1 piece small banana flower bud sliced\n\n" +
                "1 bundle pechay or bok choy\n\n" +
                "1 bundle string beans cut into 2 inch slices\n\n" +
                "4 pieces eggplants sliced\n\n" +
                "1 cup ground peanuts\n\n" +
                "1/2 cup peanut butter\n\n" +
                "1/2 cup shrimp paste\n\n" +
                "34 Ounces water about 1 Liter\n\n" +
                "1/2 cup annatto seeds soaked in a cup of water\n\n" +
                "1/2 cup toasted ground rice\n\n" +
                "1 tbsp garlic minced\n\n" +
                "1 piece onion chopped\n\n" +
                "salt and pepper"

        binding.txtDirection4.text = "In a large pot, bring the water to a boil\n\n" +
                "Put in the oxtail followed by the onions and simmer for 2.5 to 3 hrs or until tender (35 minutes if using a pressure cooker)\n\n" +
                "Once the meat is tender, add the ground peanuts, peanut butter, and coloring (water from the annatto seed mixture) and simmer for 5 to 7 minutes\n\n" +
                "Add the toasted ground rice and simmer for 5 minutes\n\n" +
                "On a separate pan, saute the garlic then add the banana flower, eggplant, and string beans and cook for 5 minutes\n\n" +
                "Transfer the cooked vegetables to the large pot (where the rest of the ingredients are)\n\n" +
                "Add salt and pepper to taste\n" +
                "Serve hot with shrimp paste. Enjoy!"

        binding.btnHome5.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }
}