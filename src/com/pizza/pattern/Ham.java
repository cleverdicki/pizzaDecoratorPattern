package com.pizza.pattern;

public class Ham extends PizzaDecorator {
    private Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Ham; Price: 5";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }
}
