package com.team19.animation.ui

import android.animation.AnimatorInflater
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatImageButton
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import com.team19.animation.R
import com.team19.animation.models.Drink
import com.team19.animation.utils.DrinksDb
import kotlinx.android.synthetic.main.activity_drink_detail.*

object Constants {
    const val DRINKS_EXTRA = "com.team19.animation.drinksExtra"
    const val DRINKS_LIST_KEY = "com.team19.animation.drinksListKey"
}

class DrinkDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink_detail)

        val drinksExtra = intent.getParcelableExtra<Drink>(Constants.DRINKS_EXTRA)

        findViewById<TextView>(R.id.drink_name).text = drinksExtra.drinkName
        findViewById<TextView>(R.id.drink_price).text =
            getString(R.string.display_price, drinksExtra.drinkPrice.toString())

        findViewById<TextView>(R.id.drink_delivery_time).text =
            getString(R.string.delivered_in, drinksExtra.drinkDeliveryTime)
        findViewById<RatingBar>(R.id.drink_rating_bar).rating = drinksExtra.drinkRating

        findViewById<AppCompatImageButton>(R.id.drink_add_cart).setOnClickListener {
            //Get the list in sp
            val drinkList =
                DrinksDb.getOrdersFromPrefs(
                    Constants.DRINKS_LIST_KEY,
                    this
                )

            //Add the present drink
            drinkList.add(drinksExtra)

            //Save the list back to sp
            DrinksDb.setOrdersInPrefs(
                Constants.DRINKS_LIST_KEY,
                drinkList,
                this
            )

            val animator = AnimatorInflater.loadAnimator(this, R.animator.translate)
            animator.apply {
                setTarget(drink_add_cart)
                start()
            }

            Toast.makeText(this, "${drinksExtra.drinkName} added to cart", Toast.LENGTH_SHORT)
                .show()
        }
    }
}
