package com.pizza.pattern;

public class Onions extends PizzaDecorator {
    private Pizza pizza;

    public Onions(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Onions; Price: 3";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 3;
    }
}
