package com.team19.animation

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //When a data item is clicked, launch the details activity
    fun openDetailsActivity(view: View) {
        val intent = Intent(this, DessertDetailsActivity::class.java)
        startActivity(intent)
    }
    //When the back button in the desserts main activity is clicked
    fun goBack(view: View) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}
