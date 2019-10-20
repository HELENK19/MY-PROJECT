package com.team19.animation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class OnboardingViewPagerAdapter extends PagerAdapter {
    Context mContext;
    List<OnBoardScreenItem> onBoardScreenItems;

    public OnboardingViewPagerAdapter(Context mContext, List<OnBoardScreenItem> onBoardScreenItems) {
        this.mContext = mContext;
        this.onBoardScreenItems = onBoardScreenItems;
    }

    @Override
    public int getCount() {
        return onBoardScreenItems.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View Layout = inflater.inflate(R.layout.intro_layout,null);

        ImageView onboardImage = Layout.findViewById(R.id.onboarding_image);
        TextView onboardTitle = Layout.findViewById(R.id.onboard_title);
        TextView onboardDescription = Layout.findViewById(R.id.onboarding_description);

        onboardTitle.setText(onBoardScreenItems.get(position).getTitle());
        onboardDescription.setText(onBoardScreenItems.get(position).getDescription());
        onboardImage.setImageResource(onBoardScreenItems.get(position).getScreenImg());

        container.addView(Layout);

        return Layout;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
