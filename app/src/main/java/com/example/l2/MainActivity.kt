package com.example.l2


import android.content.Intent
import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.l2.adapter.PizzaAdapter
import com.example.l2.data.PizzaEntity
import com.example.l2.data.pizzaList
import com.example.l2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), PizzaAdapter.OnPizzaItemClick {

    private val adapter = PizzaAdapter(this)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.pizzaList.adapter = adapter
        adapter.items.addAll(pizzaList)
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {

                adapter.items.clear()
                adapter.items.addAll(pizzaList.filter { it.name.lowercase().contains(query.toString().lowercase()) })
                adapter.notifyDataSetChanged()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText.isNullOrEmpty()){
                    adapter.items.clear()
                    adapter.items.addAll(pizzaList)
                    adapter.notifyDataSetChanged()
                }
                return true
            }

        })
    }

    override fun onClick(pizza: PizzaEntity) {
        val intent = Intent(this, PizzaDetailsActivity::class.java).putExtra("PIZZA", pizza)
        Toast.makeText(this, pizza.name, Toast.LENGTH_LONG).show()
        startActivity(intent)
    }
}




