package com.example.losowanie;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class losoweVieModel extends ViewModel {
    private MutableLiveData<Integer> losowa;

    public MutableLiveData<Integer> getLosowa() {
        if(losowa == null){
            losowa = new MutableLiveData<>();
        }
        return losowa;
    }

    public void setLosowa(MutableLiveData<Integer> losowa) {
        if(losowa == null){
            losowa = new MutableLiveData<>();
        }
        this.losowa = losowa;
    }

    public void wylosuj(){
        if(losowa == null){
            losowa = new MutableLiveData<>();
        }
        Random random = new Random();
        losowa.setValue(random.nextInt(100));
    }
}
