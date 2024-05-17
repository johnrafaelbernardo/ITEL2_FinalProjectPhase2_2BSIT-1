package com.example.pinoyrecipeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pinoyrecipeapp.databinding.ActivitySisigBinding

class Sisig : AppCompatActivity() {
    private lateinit var binding: ActivitySisigBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySisigBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.txtRecipe2.text = "Ingredients\n\n" +
                "1 ½ lbs. Pork belly\n\n" +
                "3 tablespoons Knorr Liquid Seasoning\n\n" +
                "1 lb. pig face maskara\n\n" +
                "4 ounces chicken liver\n\n" +
                "2 pieces onion\n\n" +
                "½ cup chicharon crumbled\n\n" +
                "3 tablespoons Lady’s Choice Mayonnaise\n\n" +
                "2 teaspoons onion powder\n\n" +
                "¼ teaspoon ground black pepper\n\n" +
                "½ teaspoon chili flakes optional\n\n" +
                "1 tablespoon butter\n\n" +
                "3 tablespoons cooking oil\n\n" +
                "2 quarts water\n\n"

        binding.txtDirection2.text = "Directions:\n\n" +
                "Boil water in a pot. Add pork belly and pig face. \n" +
                "Cover and continue to boil for 1 hour in medium heat. \n" +
                "Drain water and let the meat cool down.\n" +
                "Grill boiled meats for 5 minutes per side. \n" +
                "Remove from the grill and chop into small pieces. \n\n" +
                "Note: feel free to mince the meat if preferred.\n" +
                "Heat oil on a pan. \n" +
                "Saute onion for 1 minute.\n" +
                "Add chicken liver.\n" +
                " Continue to sauté until thoroughly cooked. \n" +
                "Mash the liver while cooking until it breaks down into small pieces.\n" +
                "Add minced meat and chicharon into the pan. \n\n" +
                "Stir until all ingredients are evenly distributed.\n" +
                "Add chili flakes, onion powder, and ground black pepper.\n" +
                "Pour Knorr Liquid Seasoning. \n" +
                "Stir.Add Lady’s Choice Mayonnaise. \n" +
                "Stir and cook for 3 minutes. Set aside.\n\n" +
                "Heat a metal plate. Add butter. \n" +
                "Transfer cooked sisig onto the metal plate.\n" +
                " Continue to cook until it sizzles. \n" +
                "Top with more chicharon.\n" +
                "Serve with calamansi or lime. \n" +
                "Serve. Share and enjoy with white rice.\n"
        binding.btnHome.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }
}