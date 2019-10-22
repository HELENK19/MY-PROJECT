package com.team19.animation.adapters

import android.animation.AnimatorInflater
import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import com.team19.animation.R
import com.team19.animation.models.Drink
import kotlinx.android.synthetic.main.drink_item.view.*

class DrinkAdapter(
    private val onDrinkClickListener: OnDrinkClickListener,
    private val onAddCartClickListener: OnAddCartClickListener
) :
    ListAdapter<Drink, DrinkAdapter.DrinkViewHolder>(
        DrinkDiffCallback()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrinkViewHolder {
        return DrinkViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: DrinkViewHolder, position: Int) {
        val drink = getItem(position)
        holder.itemView.setOnClickListener {
            onDrinkClickListener.onClick(drink)
        }
        holder.itemView.drink_add_cart.setOnClickListener {

            val animator =
                AnimatorInflater.loadAnimator(holder.itemView.context, R.animator.scale)
            animator.apply {
                setTarget(holder.itemView.drink_add_cart)
                start()
            }

            onAddCartClickListener.onClick(drink)
        }
        holder.bind(drink)
    }

    class DrinkViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Drink) {
            itemView.findViewById<TextView>(R.id.drink_name).text = item.drinkName
            itemView.findViewById<TextView>(R.id.drink_price).text =
                itemView.context.getString(R.string.display_price, item.drinkPrice.toString())
            itemView.findViewById<TextView>(R.id.drink_delivery_time).text = item.drinkDeliveryTime
            itemView.findViewById<RatingBar>(R.id.drink_rating_bar).rating = item.drinkRating
        }

        companion object {
            fun from(parent: ViewGroup): DrinkViewHolder {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.drink_item, parent, false)
                return DrinkViewHolder(view)
            }
        }
    }
}

class DrinkDiffCallback : DiffUtil.ItemCallback<Drink>() {
    override fun areItemsTheSame(oldItem: Drink, newItem: Drink): Boolean {
        return oldItem.drinkName == newItem.drinkName
    }

    override fun areContentsTheSame(oldItem: Drink, newItem: Drink): Boolean {
        return oldItem == newItem
    }
}

class OnDrinkClickListener(val clickListener: (item: Drink) -> Unit) {
    fun onClick(item: Drink) = clickListener(item)
}

class OnAddCartClickListener(val clickListener: (item: Drink) -> Unit) {
    fun onClick(item: Drink) = clickListener(item)
}