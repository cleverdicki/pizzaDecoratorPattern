package com.pizza.pattern;

public class Pineapple extends PizzaDecorator {
    private Pizza pizza;

    public Pineapple(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Pineapple; Price: 2";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 2;
    }
}
