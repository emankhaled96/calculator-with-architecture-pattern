package com.example.calculator_with_architecture_patterns.pojo;

import com.example.calculator_with_architecture_patterns.pojo.NumberModel;

public class DataBase {
    public NumberModel getNumbers(){
        return new NumberModel(4, 2);
    }
}
