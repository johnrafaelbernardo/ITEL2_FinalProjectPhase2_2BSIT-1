package com.example.pinoyrecipeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pinoyrecipeapp.databinding.ActivityMenudoBinding

class Menudo : AppCompatActivity() {
    private lateinit var binding: ActivityMenudoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenudoBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.txtRecipe3.text = "Ingredients\n\n" +
                "1.33 lbs. pork\n\n" +
                "0.17 lb. pig liven\n\n" +
                "0.67 cup potatoes diced\n\n" +
                "0.67 piece carrot cubed\n\n" +
                "0.33 cup soy sauce\n\n" +
                "0.33 piece lemon\n\n" +
                "0.67 piece onion chopped\n\n" +
                "2 cloves garlic minced\n\n" +
                "0.67 teaspoon sugar\n\n" +
                "0.5 cup tomato sauce\n\n" +
                "0.67 cup water\n\n" +
                "2.67 pieces hotdogs sliced diagonally\n\n" +
                "1.33 tablespoons cooking oil\n\n" +
                "1.33 to 2 pieces dried bay leaves\n\n" +
                "Salt and pepper to taste\n"

        binding.txtDirection3.text = "Directions:\n\n" +
                "Combine pork, soy sauce, and lemon in a bowl. \n" +
                "Marinate for at least 1 hour.\n" +
                "Heat oil in a pan\n" +
                "Saute garlic and onion.\n" +
                "Add the marinated pork. Cook for 5 to 7 minutes.\n\n" +
                "Pour in tomato sauce and water and then add the bay leaves.\n" +
                "Let boil and simmer for 30 minutes to an hour depending on the toughness of the pork. \n" +
                "Note: Add water as necessary.\n" +
                "Add-in the liver and hot dogs.\n" +
                "Cook for 5 minutes.\n\n" +
                "Put-in potatoes, carrots, sugar,salt, and pepper. \n" +
                "Stir and cook for 8 to 12 minutes.\n" +
                "Serve. Share and enjoy!\n"

        binding.btnHome.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }

    }
}