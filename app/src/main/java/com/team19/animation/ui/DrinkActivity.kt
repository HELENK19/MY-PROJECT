package com.team19.animation.ui

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.transition.Fade
import androidx.transition.TransitionManager
import com.team19.animation.R
import com.team19.animation.adapters.DrinkAdapter
import com.team19.animation.adapters.OnAddCartClickListener
import com.team19.animation.adapters.OnDrinkClickListener
import com.team19.animation.models.Drink
import com.team19.animation.utils.DrinksDb
import com.team19.animation.utils.DrinkCellar

class DrinkActivity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        //Just initialize an empty list to avoid an NPE
        val emptyOrderList = mutableListOf<Drink>()

        DrinksDb.setOrdersInPrefs(
            Constants.DRINKS_LIST_KEY,
            emptyOrderList,
            this
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)

        val recView = findViewById<RecyclerView>(R.id.recycler_view)

        val adapter =
            DrinkAdapter(OnDrinkClickListener {
                val transition = Fade()
                TransitionManager.beginDelayedTransition(root_scene, transition)

                val drinksIntent = Intent(this, DrinkDetailActivity::class.java)
                drinksIntent.putExtra(Constants.DRINKS_EXTRA, it)
                startActivity(drinksIntent)
            }, OnAddCartClickListener {
                //Get the list in sp
                val drinkList =
                    DrinksDb.getOrdersFromPrefs(
                        Constants.DRINKS_LIST_KEY,
                        this
                    )

                //Add the present drink
                drinkList.add(it)

                //Save the list back to sp
                DrinksDb.setOrdersInPrefs(
                    Constants.DRINKS_LIST_KEY,
                    drinkList,
                    this
                )

                Toast.makeText(this, "${it.drinkName} added to cart", Toast.LENGTH_SHORT).show()
            })

        adapter.submitList(DrinkCellar.getDrinks())

        recView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.drink_show_cart) {
            //TODO: Start the cart activity from here and retrieve the drinks list from shared preferences
        }
        return super.onOptionsItemSelected(item)
    }
}
