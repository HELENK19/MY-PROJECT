package com.team19.animation.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.team19.animation.models.Food;
import com.team19.animation.repository.AppRepository;

import java.util.List;

public class DessertsViewModel extends ViewModel {

    public AppRepository appRepository;
    public LiveData<Food> allDeserts ;

    public DessertsViewModel() {
        appRepository = AppRepository.getInstance();
        allDeserts = appRepository.getAllDesserts();
    }

    public LiveData<Food> getAllDeserts(){
        return allDeserts ;
    }
}
