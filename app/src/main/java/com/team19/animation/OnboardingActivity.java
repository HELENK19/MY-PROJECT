package com.team19.animation;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OnboardingActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewPager layoutPager;
    OnboardingViewPagerAdapter onboardingViewPagerAdapter;
    TabLayout tabLayout;
    Button btnNext,btnGetStarted;
    int position = 0;
    private List<OnBoardScreenItem> mList;
    Animation btnAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Check if its the first time opening app
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        boolean isNotFirstTime = preferences.getBoolean("isFirstTime",false);

        if(isNotFirstTime){
            startLoginActivity();
        }

        setContentView(R.layout.activity_onboarding);



        //InitViews
        tabLayout = findViewById(R.id.tab_indicator);
        btnNext = findViewById(R.id.button_next);
        btnGetStarted = findViewById(R.id.button_get_started);
        btnAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.get_started_animation);

        mList = new ArrayList<>();
        mList.add(new OnBoardScreenItem("Welcome to Shibe Restaurant",getString(R.string.Lorem),R.drawable.img1));
        mList.add(new OnBoardScreenItem("Fresh Foods ",getString(R.string.Lorem),R.drawable.img1));
        mList.add(new OnBoardScreenItem("Fast Delivery to your Destination",getString(R.string.Lorem),R.drawable.img2));
        mList.add(new OnBoardScreenItem("Easy Payment Via Mpesa",getString(R.string.Lorem),R.drawable.img3));

        //viewpager
        layoutPager = findViewById(R.id.viewPager_onboarding);
        onboardingViewPagerAdapter = new OnboardingViewPagerAdapter(this, mList);
        layoutPager.setAdapter(onboardingViewPagerAdapter);

        tabLayout.setupWithViewPager(layoutPager);

        btnNext.setOnClickListener(this);
        btnGetStarted.setOnClickListener(this);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == mList.size() - 1){
                    loadFinalScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                btnNext.setVisibility(View.VISIBLE);
                btnGetStarted.setVisibility(View.INVISIBLE);
                tabLayout.setVisibility(View.VISIBLE);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button_next){
            position = layoutPager.getCurrentItem();
            if(position < mList.size()){
                position++;
                layoutPager.setCurrentItem(position);
            }
            if(position == mList.size() ){
                loadFinalScreen();
            }
        }
        if(v.getId() ==R.id.button_get_started){
            startLoginActivity();
            finish();
        }
    }

    private void startLoginActivity() {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("isFirstTime",true);
        editor.apply();
    }

    private void loadFinalScreen() {
        btnNext.setVisibility(View.INVISIBLE);
        btnGetStarted.setVisibility(View.VISIBLE);
        tabLayout.setVisibility(View.INVISIBLE);
        btnGetStarted.setAnimation(btnAnimation);
    }
}
