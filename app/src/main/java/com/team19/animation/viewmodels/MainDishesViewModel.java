package com.team19.animation.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.team19.animation.models.Food;
import com.team19.animation.repository.AppRepository;

import java.util.List;

public class MainDishesViewModel extends ViewModel {

    public AppRepository appRepository ;
    public LiveData<Food> allDishes ;

    public MainDishesViewModel() {
        appRepository = AppRepository.getInstance();
        allDishes = appRepository.getAllMainDishes();
    }

    public LiveData<Food> getAllDishes(){
        return allDishes ;
    }
}
