package com.team19.animation.utils

import com.team19.animation.models.Drink

object DrinkCellar {
    fun getDrinks(): List<Drink> {
        val drinkList = mutableListOf<Drink>()
        drinkList.add(Drink("Jameson", 2000, drinkRating = 3f))
        drinkList.add(Drink("Ciroc", 3000, drinkRating = 4.5f))
        drinkList.add(
            Drink(
                "Agua de Valencia",
                1500,
                drinkRating = 3.5f
            )
        )
        drinkList.add(Drink("Ruby Dutchess", 12000, drinkRating = 3f))
        drinkList.add(Drink("Spritzer", 5000, drinkRating = 3f))
        drinkList.add(Drink("Rourou", 2500, drinkRating = 3f))
        drinkList.add(
            Drink(
                "Chocolate Martini",
                2500,
                drinkRating = 3f
            )
        )
        drinkList.add(Drink("Apple-Kneel", 2800, drinkRating = 3f))
        drinkList.add(Drink("Balozi", 3200, drinkRating = 1.5f))
        drinkList.add(Drink("Kenya Kane", 2000))
        drinkList.add(Drink("Batida", 6000, drinkRating = 3f))
        drinkList.add(Drink("Flaming Sambuca", 5000, drinkRating = 5f))
        return drinkList
    }
}