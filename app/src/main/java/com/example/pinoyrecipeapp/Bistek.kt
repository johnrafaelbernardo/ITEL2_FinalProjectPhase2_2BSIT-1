package com.example.pinoyrecipeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pinoyrecipeapp.databinding.ActivityBistekBinding
import com.example.pinoyrecipeapp.databinding.ActivityKarekareBinding

class Bistek : AppCompatActivity() {
    private lateinit var binding: ActivityBistekBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBistekBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.txtRecipe5.text = "Ingredients\n\n" +
                "1 1/2 lbs beef sirloin thinly sliced\n\n" +
                "5 tablespoons soy sauce\n\n" +
                "4 pieces calamansi or 1-piece lemon\n\n" +
                "1/2 tsp ground black pepper\n\n" +
                "3 cloves garlic minced\n\n" +
                "3 pieces yellow onion sliced into rings\n\n" +
                "4 tablespoons cooking oil\n\n" +
                "1 cup water\n\n" +
                "1 pinch salt"

        binding.txtDirection5.text = "Directions\n\n" +
                "Marinate beef in soy sauce, lemon (or calamansi), and ground black pepper for at least 1 hour.\n" +
                "Note: marinate overnight for best result\n" +
                "Heat the cooking oil in a pan then pan-fry half of the onions until the texture becomes soft. Set aside\n\n" +
                "Drain the marinade from the beef. Set it aside. " +
                "Pan-fry the beef on the same pan where the onions were fried for 1 minute per side. " +
                "Remove from the pan. Set aside\n\n" +
                "Add more oil if needed. Saute garlic and remaining raw onions until onion softens.\n" +
                "Pour the remaining marinade and water. Bring to a boil.\n" +
                "Add beef. Cover the pan and simmer until meat is tender." +
                " Note: Add water as needed.\n\n" +
                "Season with ground black pepper and salt as needed. " +
                "Top with pan-fried onions.\n" +
                "Transfer to a serving plate. Serve hot. Share and Enjoy!\n"

        binding.btnHome5.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }

    }
}