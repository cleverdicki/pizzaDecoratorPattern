package com.pizza.pattern;

public class TempPizza implements Pizza {
    @Override
    public String getDesc() {
        return "Pizza; Price: 10";
    }

    public int getPrice() {
        return 10;
    }
}
