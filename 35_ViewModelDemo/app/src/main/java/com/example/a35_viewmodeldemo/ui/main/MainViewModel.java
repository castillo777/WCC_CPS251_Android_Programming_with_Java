package com.example.a35_viewmodeldemo.ui.main;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private static final Float usd_to_eu_rate = 0.74F;
    public MutableLiveData<String> dollarValue = new MutableLiveData<>();
    public MutableLiveData<Float> result = new MutableLiveData<>();

    public void convertValue() {
        if((dollarValue.getValue() != null) && (dollarValue.getValue().equals(""))) {
            result.setValue(Float.valueOf(dollarValue.getValue()) * usd_to_eu_rate);
        } else
            result.setValue(0F);
    }
}
