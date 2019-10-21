package com.team19.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void openDrinksActivity(View view) {
        //Intent intent = new Intent(this, DrinksActivity.class);
        //startActivity(intent);
    }

    public void openMainDishesActivity(View view) {
        //Intent intent = new Intent(this, MainDishesActivity.class);
        //startActivity(intent);
    }

    public void openDessertActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
