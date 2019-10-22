package com.team19.animation.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import com.team19.animation.models.Food;
import com.team19.animation.repository.AppRepository;



public class DrinksViewModel extends ViewModel {
        public AppRepository appRepository ;
        public LiveData<Food> allDrinks ;

    public DrinksViewModel(){
        appRepository = AppRepository.getInstance();
        allDrinks = appRepository.getAllDrinks();
    }

    public LiveData<Food> getAllDrinks(){
        return allDrinks ;
    }
}
