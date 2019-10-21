package com.team19.animation.ui;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

import com.team19.animation.adapters.CartAdapter;
import com.team19.animation.R;
import com.team19.animation.models.FoodBean;

import java.util.ArrayList;



public class CartActivity extends AppCompatActivity {
    private final static int FADE_DURATION = 5000;
    private ArrayList<FoodBean> foodStuff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        RecyclerView rvCart = (RecyclerView) findViewById(R.id.rvCart);
        Button checkOut=(Button) findViewById(R.id.order);

        checkOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFadeAnimation(v);
                Snackbar snackbar = Snackbar
                        .make(v, "Your order has been placed", Snackbar.LENGTH_SHORT);

                snackbar.show();


            }
        });



        foodStuff=prepareFoodData();
        CartAdapter adapter = new CartAdapter(foodStuff,this);

        rvCart.setAdapter(adapter);

        rvCart.setLayoutManager(new LinearLayoutManager(this));
        //adding animation on the delete icon

       // rvCart.setItemAnimator(new ScaleInBottomAnimator());
        rvCart.getItemAnimator().setRemoveDuration(1000);



    }
    private void setFadeAnimation(View view) {
        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(FADE_DURATION);
        view.startAnimation(anim);}

    private ArrayList<FoodBean> prepareFoodData(){
        int[] image=new int[]{R.drawable.pizza,R.drawable.cocacola};
        String[] title=new String []{"Pizza","Cocacola"};
        String[] description=new String[]{"Discovering moments of happiness","Quench your thirst"};
        int[] price=new int[]{500,50};
        ArrayList<FoodBean> food = new ArrayList<>();

        for(int i = 0; i < title.length; i++){
            FoodBean foodbean = new FoodBean();
            foodbean.setName(title[i]);
            foodbean.setImageDrawable(image[i]);
            foodbean.setDescription(description[i]);
            foodbean.setPrice(price[i]);
            food.add(foodbean);

        }
        return food;
    }

}


