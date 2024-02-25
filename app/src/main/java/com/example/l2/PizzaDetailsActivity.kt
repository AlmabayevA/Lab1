package com.example.l2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.l2.data.PizzaEntity
import com.example.l2.databinding.ActivityPizzaDetailsBinding

class PizzaDetailsActivity: AppCompatActivity() {

    private lateinit var binding: ActivityPizzaDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val pizza: PizzaEntity = intent.getSerializableExtra("PIZZA") as PizzaEntity
        binding = ActivityPizzaDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.pizzaDescription.text = pizza.description
        binding.textAboba.text = pizza.name
        binding.imageView.setImageResource(pizza.imageRes)
        binding.pizzaSize.text = pizza.size
    }
}