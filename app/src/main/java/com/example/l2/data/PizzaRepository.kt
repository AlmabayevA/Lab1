package com.example.l2.data

import com.example.l2.R
import java.io.Serializable

interface PizzaRepository {

    fun getPizzaList(): List<PizzaEntity>

    fun getPizza(id: Int): PizzaEntity

    fun savePizza(pizzaEntity: PizzaEntity): Boolean

}

val pizzaList = listOf(
    PizzaEntity(
        id = 213372,
        name = "Cheese pizza",
        imageRes = R.drawable.cheese_pizza,
        description = "Pizza with 4 cheeses",
        size = "30cm, Традиционное тесто, 420г",
        price = 2690
    ),
    PizzaEntity(
        id = 170429,
        name = "Chicken pizza with BBQ",
        imageRes = R.drawable.chicken_bbq_pizza,
        description = "Pizza with chicken and BBQ sauce",
        size = "30cm, Традиционное тесто, 400г",
        price = 2390
    ),
    PizzaEntity(
        id = 111111,
        name = "Four seasons pizza",
        imageRes = R.drawable.four_seasons_pizza,
        description = "Pizza with 4 different flavours parts (mushrooms, chicken, pepperoni, vegetables",
        size = "30cm, Традиционное тесто, 470г",
        price = 2890
    ),
    PizzaEntity(
        id = 222222,
        name = "Hawaiian pizza",
        imageRes = R.drawable.hawaii_pizza,
        description = "Pizza with chicken and pineapples",
        size = "30cm, Традиционное тесто, 435г",
        price = 2690
    ),
    PizzaEntity(
        id = 333333,
        name = "Margarita",
        imageRes = R.drawable.margarita,
        description = "Pizza with tomatoes",
        size = "30cm, Традиционное тесто, 390г",
        price = 1990
    ),
    PizzaEntity(
        id = 444444,
        name = "Pepperoni",
        imageRes = R.drawable.pepperoni,
        description = "Pizza with pepperoni",
        size = "30cm, Традиционное тесто, 400г",
        price = 2390
    ),
    PizzaEntity(
        id = 555555,
        name = "Pesto",
        imageRes = R.drawable.pesto_pizza,
        description = "Pizza with chicken and pesto sauce",
        size = "30cm, Традиционное тесто, 4350г",
        price = 2590
    )
)

data class PizzaEntity(
    val id: Int,
    val name: String,
    val imageRes: Int,
    val description: String,
    val price: Int,
    val size: String
): Serializable