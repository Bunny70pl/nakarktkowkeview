package com.example.losowanie;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class losoweVieModel extends ViewModel {
    private int losowa;

    public int getLosowa() {
        return losowa;
    }

    public void setLosowa(int losowa) {
        this.losowa = losowa;
    }

    public void wylosuj(){
        Random random = new Random();
        losowa = random.nextInt(100);
    }
}
