package com.team19.animation.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.team19.animation.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendIntent(view: View) {
        val intent = Intent(this,MainDishesDetailsActivity::class.java)
        startActivity(intent)
    }
}
