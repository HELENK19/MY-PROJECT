package com.team19.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class DessertDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dessert_detail);
    }

    public void sendRequestClicked(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"Request sent",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void addToCart(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"Added to cart",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void openMainActivity(View view) {
        //Going back to the main activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
