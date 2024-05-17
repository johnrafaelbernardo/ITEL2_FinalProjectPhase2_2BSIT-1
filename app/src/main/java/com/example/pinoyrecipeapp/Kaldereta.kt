package com.example.pinoyrecipeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pinoyrecipeapp.databinding.ActivityKalderetaBinding

class Kaldereta : AppCompatActivity() {
    private lateinit var binding: ActivityKalderetaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKalderetaBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.txtRecipe8.text =
                " Ingredients:\n" +
                "\n" +
                "- 1 kg beef (cubed)\n" +
                "\n" +
                "- 2 large potatoes (quartered)\n" +
                "\n" +
                "- 2 large carrots (cut into chunks)\n" +
                "\n" +
                "- 1 red bell pepper (sliced)\n" +
                "\n" +
                "- 1 green bell pepper (sliced)\n" +
                "\n" +
                "- 1 onion (chopped)\n" +
                "\n" +
                "- 4 cloves garlic (minced)\n" +
                "\n" +
                "- 1 can (400g) tomato sauce\n" +
                "\n" +
                "- 1 cup beef broth\n" +
                "\n" +
                "- 1/2 cup green olives (optional)\n" +
                "\n" +
                "- 1/2 cup liver spread (optional)\n" +
                "\n" +
                "- 3 tablespoons cooking oil\n" +
                "\n" +
                "- Salt and pepper to taste\n" +
                "\n" +
                " Marinade:\n" +
                "\n" +
                "- 1/4 cup soy sauce\n" +
                "\n" +
                "- 1/4 cup vinegar\n" +
                "\n" +
                "- 3 cloves garlic (minced)\n" +
                "\n" +
                "- 1 teaspoon black pepper"

        binding.txtDirection8.text = " Directions:\n" +
                "\n" +
                "1. Marinate the beef cubes in soy sauce, vinegar, minced garlic, and black pepper for at least 1 hour, or preferably overnight in the refrigerator.\n" +
                "\n" +
                "2. In a large pot or deep pan, heat the cooking oil over medium heat. Sauté the onions and garlic until fragrant and translucent.\n" +
                "\n" +
                "3. Add the marinated beef cubes and cook until browned on all sides.\n" +
                "\n" +
                "4. Pour in the tomato sauce and beef broth. Stir to combine.\n" +
                "\n" +
                "5. Cover and simmer over low heat until the beef is tender, about 1.5 to 2 hours. Add more broth or water if needed to keep the beef moist.\n" +
                "\n" +
                "6. Once the beef is tender, add the potatoes and carrots. Cook until the vegetables are fork-tender.\n" +
                "\n" +
                "7. Add the sliced bell peppers, green olives (if using), and liver spread (if using). Stir to incorporate.\n" +
                "\n" +
                "8. Simmer for another 5-10 minutes to allow the flavors to meld together.\n" +
                "\n" +
                "9. Season with salt and pepper to taste.\n" +
                "\n" +
                "10. Serve hot with steamed rice.\n"

        binding.btnHome8.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }

    }
}