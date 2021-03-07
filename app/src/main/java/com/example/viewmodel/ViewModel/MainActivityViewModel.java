package com.example.viewmodel.ViewModel;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private String num;

    public String getNum() {
        if (num == null)
            setNum();
        return num;
    }

    private void setNum() {
        Random random = new Random();
        num = "" + random.nextInt(50);
    }
}
