package com.team19.animation.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Drink(
    val drinkName: String,
    val drinkPrice: Int,
    val drinkDeliveryTime: String = "30 minutes",
    val drinkRating: Float = 2f
) : Parcelable