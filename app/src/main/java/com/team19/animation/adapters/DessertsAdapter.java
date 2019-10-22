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

public class DessertsAdapter extends RecyclerView.Adapter<DessertsAdapter.ViewHolder> {
    List<FoodBean> foodBeanList ;
    Context context ;
    OnSingleDessertItemClicked dessertItemClicked ;

    public DessertsAdapter(List<FoodBean> foodBeanList, Context context, OnSingleDessertItemClicked dessertItemClicked) {
        this.foodBeanList = foodBeanList;
        this.context = context;
        this.dessertItemClicked = dessertItemClicked;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_dishes_menu_list, viewGroup, false);
        return new ViewHolder(view,dessertItemClicked);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        OnSingleDessertItemClicked dessertItemClicked ;
        public ViewHolder(@NonNull View itemView , OnSingleDessertItemClicked dessertItemClicked) {
            super(itemView);
            this.dessertItemClicked = dessertItemClicked ;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            dessertItemClicked.singleDessertItemClicked(getAdapterPosition());
        }
    }

    public interface OnSingleDessertItemClicked{
        void singleDessertItemClicked(int position);
    }
}
