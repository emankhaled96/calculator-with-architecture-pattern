package com.example.calculator_with_architecture_patterns.pojo;

public class NumberModel {
    private int firstNum, secondNum;

    public NumberModel(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int getFirstNum() {
        return firstNum;
    }
    public int getSecondNum() {
        return secondNum;
    }
}
