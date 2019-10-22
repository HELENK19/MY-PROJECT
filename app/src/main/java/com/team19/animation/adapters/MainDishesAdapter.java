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

public class MainDishesAdapter extends RecyclerView.Adapter<MainDishesAdapter.ViewHolder> {
    List<FoodBean> foodBeanList ;
    Context context ;
    OnSingleMenuItemClicked menuItemClicked ;

    public MainDishesAdapter(List<FoodBean> foodBeanList, Context context, OnSingleMenuItemClicked menuItemClicked) {
        this.foodBeanList = foodBeanList;
        this.context = context;
        this.menuItemClicked = menuItemClicked;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_dishes_menu_list,viewGroup,false);
        return new ViewHolder(view,menuItemClicked);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return foodBeanList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        OnSingleMenuItemClicked singleMenuItemClicked ;
        public ViewHolder(@NonNull View itemView , OnSingleMenuItemClicked singleMenuItemClicked) {
            super(itemView);
            this.singleMenuItemClicked = singleMenuItemClicked ;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            singleMenuItemClicked.singleMenuItemClicked(getAdapterPosition());
        }
    }

    public interface OnSingleMenuItemClicked{
        void singleMenuItemClicked(int position) ;
    }
}
