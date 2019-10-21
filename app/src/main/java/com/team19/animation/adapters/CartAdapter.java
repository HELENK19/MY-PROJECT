package com.team19.animation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.team19.animation.R;
import com.team19.animation.models.FoodBean;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    private ArrayList<FoodBean> mFood;
    private Context context;
    private int quantity=1;
    private int price;
    private View view;
    private final static int FADE_DURATION = 1000;

    public CartAdapter(ArrayList<FoodBean> food, Context context) {
        mFood = food;
        this.context=context;
    }
    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);


        View contactView = inflater.inflate(R.layout.item_cart, parent, false);


        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {
        holder.foodTitle.setText(mFood.get(position).getName());
        holder.foodImage.setImageResource(mFood.get(position).getImageDrawable());
        holder.foodDescription.setText(mFood.get(position).getDescription());
        price=mFood.get(position).getPrice();
        holder.foodPrice.setText("ksh" +String.valueOf(mFood.get(position).getPrice()));
        view=holder.itemView;
        setFadeAnimation(holder.itemView);

    }
    private void setFadeAnimation(View view) {
        ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        anim.setDuration(FADE_DURATION);

        view.startAnimation(anim);}


    @Override
    public int getItemCount() {
        return mFood.size();
    }
    public void removeItem(int position) {
        mFood.remove(position);

        notifyItemRemoved(position);
        notifyItemRangeChanged(position, mFood.size());
        setFadeAnimation(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView foodTitle,counter,foodDescription,foodPrice;
        public ImageView foodImage,imageDelete;
        public Button decrementQuantity,incrementQuantity;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodTitle=(TextView) itemView.findViewById(R.id.tvTitle);
            imageDelete=(ImageView)itemView.findViewById(R.id.img_row_delete) ;
            foodPrice=(TextView)itemView.findViewById(R.id.tvPrice) ;
            foodDescription=(TextView) itemView.findViewById(R.id.tvDescription);
            foodImage=(ImageView) itemView.findViewById(R.id.food_image);
            counter=(TextView) itemView.findViewById(R.id.tvQuantity) ;
            incrementQuantity=(Button) itemView.findViewById(R.id.incrementBtn);
            decrementQuantity=(Button) itemView.findViewById(R.id.decrementBtn);
            setListeners();
            itemView.setOnClickListener(this);
        }
        public void setListeners(){
            decrementQuantity.setOnClickListener(this);
            incrementQuantity.setOnClickListener(this);
            imageDelete.setOnClickListener(this);
        }
        public void decrementQuantity(){
        // When you decrement the quantity beyond 1, 0
        // will result in 0*price, which is an ultimate crash.
        //So accept decrement while its still more than one
        //Else the user should just remove it instead of decrementing past one.
             if(quantity > 1){
            quantity=quantity-1;
            price=(price*quantity)/(quantity+1);
            counter.setText(String.valueOf(quantity));
            foodPrice.setText("ksh"+price);
           }

        }
        public void incrementQuantity(){
            quantity=quantity+1;
            price=price*quantity;
            counter.setText(String.valueOf(quantity));
            foodPrice.setText("ksh"+price);

        }


        @Override
        public void onClick(View v) {
            if (v==decrementQuantity)
                decrementQuantity();
            else if(v==incrementQuantity)
                incrementQuantity();
            else if(v==imageDelete)
                removeItem(getPosition());
        }
    }
}
