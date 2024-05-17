package com.example.pinoyrecipeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pinoyrecipeapp.databinding.ActivitySinigangBinding

class Sinigang : AppCompatActivity() {
    private lateinit var binding: ActivitySinigangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySinigangBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.txtRecipe6.text = " Ingredients:\n" +
                "\n" +
                "- 1 lb (450g) of your choice of protein (pork, shrimp, fish, or beef)\n" +
                "\n" +
                "- 1 medium-sized onion, quartered\n" +
                "\n" +
                "- 2 medium-sized tomatoes, quartered\n" +
                "\n" +
                "- 1 thumb-sized ginger, sliced\n" +
                "\n" +
                "- 1 medium-sized radish, sliced\n" +
                "\n" +
                "- 1 medium-sized eggplant, sliced\n" +
                "\n" +
                "- 1 cup string beans, cut into 2-inch lengths\n" +
                "\n" +
                "- 1 bunch of kangkong (water spinach) or spinach\n" +
                "\n" +
                "- 2-3 pieces green chili peppers (optional)\n" +
                "\n" +
                "- 1 packet (about 40g) sinigang mix (tamarind soup base)\n" +
                "\n" +
                "- 8 cups of water\n" +
                "\n" +
                "- Salt and pepper to taste\n"

        binding.txtDirection6.text = "Directions:\n" +
                "\n" +
                "Prepare the Ingredients: Wash all the vegetables thoroughly. Cut the protein into serving pieces. Slice the onion, tomatoes, ginger, radish, eggplant, and string beans. Remove the tough ends of the kangkong or spinach. If using shrimp, peel and devein them but leave the heads on for added flavor.\n" +
                "\n" +
                "Boil the Water: In a pot, bring the water to a boil.\n" +
                "\n" +
                "Add the Aromatics: Once the water is boiling, add the onion, tomatoes, and ginger. Let it simmer for about 5 minutes until the vegetables are tender.\n" +
                "\n" +
                "Add the Protein: Add your choice of protein to the pot. Let it simmer until the meat is tender. If using shrimp, they cook quickly, so add them later to avoid overcooking.\n" +
                "\n" +
                "Add the Vegetables: Add the radish, eggplant, and string beans to the pot. Let it simmer until the vegetables are cooked but still firm.\n"

        binding.btnHome5.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }
}