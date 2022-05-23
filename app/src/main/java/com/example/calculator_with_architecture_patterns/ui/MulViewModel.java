package com.example.calculator_with_architecture_patterns.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.calculator_with_architecture_patterns.pojo.DataBase;

public class MulViewModel extends ViewModel {
    MutableLiveData<String> mulMutableLiveData = new MutableLiveData<>();

    private int getMulOfTwoNumbers(){
        return new DataBase().getNumbers().getFirstNum() * new DataBase().getNumbers().getSecondNum();
    }
public void getResult(){
        int mulRes = getMulOfTwoNumbers();
        mulMutableLiveData.setValue("MulRes = " + mulRes);
}

}
