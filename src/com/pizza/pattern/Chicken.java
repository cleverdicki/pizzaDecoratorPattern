package com.pizza.pattern;

public class Chicken extends PizzaDecorator {
    private Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Chicken; Price: 5";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }
}
