package com.example.calculator_with_architecture_patterns.ui;

import com.example.calculator_with_architecture_patterns.pojo.DataBase;
import com.example.calculator_with_architecture_patterns.pojo.NumberModel;

public class DivisionPresenter {
    NumberDivView view;

    public DivisionPresenter(NumberDivView view) {
        this.view = view;
    }

    public void getDivsionResult(){
       view.onGetDivisionResult((new DataBase().getNumbers().getFirstNum()/new DataBase().getNumbers().getSecondNum()));
    }
}
