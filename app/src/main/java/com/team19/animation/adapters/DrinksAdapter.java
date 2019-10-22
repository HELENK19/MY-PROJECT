package com.team19.animation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.team19.animation.R;
import com.team19.animation.models.FoodBean;

import java.util.List;

public class DrinksAdapter extends RecyclerView.Adapter<DrinksAdapter.ViewHolder> {
    List<FoodBean> foodBeanList ;
    Context context ;
    OnSingleDrinkItemClicked drinkItemClicked ;

    public DrinksAdapter(List<FoodBean> foodBeanList, Context context, OnSingleDrinkItemClicked drinkItemClicked) {
        this.foodBeanList = foodBeanList;
        this.context = context;
        this.drinkItemClicked = drinkItemClicked;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_dishes_menu_list,viewGroup,false);
        return new ViewHolder(view,drinkItemClicked);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return foodBeanList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        OnSingleDrinkItemClicked drinkItemClicked ;
        public ViewHolder(@NonNull View itemView,OnSingleDrinkItemClicked drinkItemClicked) {
            super(itemView);
            this.drinkItemClicked = drinkItemClicked ;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            drinkItemClicked.singleDrinkItemClicked(getAdapterPosition());
        }
    }

    public interface OnSingleDrinkItemClicked{
        void singleDrinkItemClicked(int position);
    }
}
