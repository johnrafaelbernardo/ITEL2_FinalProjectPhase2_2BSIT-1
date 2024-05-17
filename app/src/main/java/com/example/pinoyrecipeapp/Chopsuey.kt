package com.example.pinoyrecipeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pinoyrecipeapp.databinding.ActivityChopsueyBinding

class Chopsuey : AppCompatActivity() {
    private lateinit var binding: ActivityChopsueyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChopsueyBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.txtRecipe7.text = " Ingredients:\n" +
                "\n" +
                "- 2 boneless, skinless chicken breasts, thinly sliced\n" +
                "\n" +
                "- 2 tablespoons vegetable oil\n" +
                "\n" +
                "- 2 cloves garlic, minced\n" +
                "\n" +
                "- 1 onion, sliced\n" +
                "\n" +
                "- 2 cups sliced mixed vegetables (such as bell peppers, carrots, broccoli, mushrooms, snow peas)\n" +
                "\n" +
                "- 1 cup bean sprouts\n" +
                "\n" +
                "- 1/4 cup soy sauce\n" +
                "\n" +
                "- 1 tablespoon oyster sauce\n" +
                "\n" +
                "- 1 teaspoon sugar\n" +
                "\n" +
                "- Salt and pepper to taste\n" +
                "\n" +
                "- 2 cups cooked white rice, for serving\n" +
                "\n" +
                "- Optional: sliced green onions for garnish"

        binding.txtDirection7.text = "Directions:\n" +
                "\n" +
                "1. Heat 1 tablespoon of vegetable oil in a large skillet or wok over medium-high heat. Add the sliced chicken breasts and cook until browned and cooked through, about 5-7 minutes. Remove the chicken from the skillet and set aside.\n" +
                "\n" +
                "2. In the same skillet, add another tablespoon of vegetable oil if needed. Add the minced garlic and sliced onion, and cook until the onion is softened, about 2-3 minutes.\n" +
                "\n" +
                "3. Add the mixed vegetables to the skillet and stir-fry until they are tender-crisp, about 5 minutes.\n" +
                "\n" +
                "4. Return the cooked chicken to the skillet. Add the bean sprouts and stir to combine.\n" +
                "\n" +
                "5. In a small bowl, mix together the soy sauce, oyster sauce, and sugar. Pour the sauce over the chicken and vegetables in the skillet. Stir well to coat everything evenly. \n" +
                "\n" +
                "6. Cook for an additional 2-3 minutes, until everything is heated through and the sauce has thickened slightly. Taste and adjust seasoning with salt and pepper if needed.\n" +
                "\n" +
                "7. Serve hot over cooked white rice. Garnish with sliced green onions if desired.\n"

        binding.btnHome7.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }

    }
}