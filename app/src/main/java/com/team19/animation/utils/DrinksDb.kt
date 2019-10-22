package com.team19.animation.utils

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.google.gson.Gson
import com.team19.animation.models.Drink

/*These methods save the order list to the shared preferences so the user can choose
* multiple items even after leaving the details screen*/
object DrinksDb {
    fun setOrdersInPrefs(key: String, orders: MutableList<Drink>, context: Context?) {
        val sp: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(context)
        val editor = sp.edit()

        val jsonText = Gson().toJson(orders)
        editor.putString(key, jsonText)
        editor.apply()
    }

    fun getOrdersFromPrefs(key: String, context: Context?): MutableList<Drink> {
        val sp: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(context)

        val jsonText = sp.getString(key, null)!!

        val orders = Gson().fromJson(
            jsonText,
            Array<Drink>::class.java
        )

        return orders.toMutableList()
    }
}