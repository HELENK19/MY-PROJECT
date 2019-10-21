package com.team19.animation.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.team19.animation.R;
import com.team19.animation.utils.BounceInterpolater;

public class MainDishesDetailsActivity extends AppCompatActivity {
    public EditText etRequest ;
    public Button btnSendRequests, addToCart ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dishes_details);

        etRequest = findViewById(R.id.reviews_txt);
        btnSendRequests = findViewById(R.id.btn_send_request);
        addToCart = findViewById(R.id.add_cart);

        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainDishesDetailsActivity.this, R.anim.button_anim);
                BounceInterpolater bounceInterpolater = new BounceInterpolater(0.2, 20);
                animation.setInterpolator(bounceInterpolater);
                addToCart.startAnimation(animation);

               // Toast.makeText(MainDishesDetailsActivity.this.getApplicationContext(), "Sent to cart activity", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), CartActivity.class);
                finish();
                startActivity(intent);
            }
        });

    }

    public void ifButtonClicked(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.button_anim);

        BounceInterpolater interpolator = new BounceInterpolater(0.2, 20);
        animation.setInterpolator(interpolator);
        btnSendRequests.startAnimation(animation);

        Toast.makeText(getApplicationContext(), "Clicked Button", Toast.LENGTH_SHORT).show();
    }
}
