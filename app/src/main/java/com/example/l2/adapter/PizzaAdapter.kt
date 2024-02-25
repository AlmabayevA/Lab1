package com.example.l2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.l2.data.PizzaEntity
import com.example.l2.databinding.LayoutPizzaItemBinding

class PizzaAdapter(val callBack:OnPizzaItemClick): RecyclerView.Adapter<PizzaAdapter.ViewHolder>(){
    val items = mutableListOf<PizzaEntity>()

    interface OnPizzaItemClick{
        fun onClick(pizza: PizzaEntity)
    }


    inner class ViewHolder(private val binding: LayoutPizzaItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item:PizzaEntity){
            binding.imageView.setImageResource(item.imageRes)
            binding.textAboba.text = item.name
            binding.pizzaDescription.text = item.description
            binding.buttoncost.text = item.price.toString()
            binding.buttoncost.setOnClickListener{
                callBack.onClick(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutPizzaItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item = items.get(position)
        holder.bind(item)
    }


}